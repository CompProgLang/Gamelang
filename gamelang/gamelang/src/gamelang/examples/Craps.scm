STAT BALANCE = 500
STAT PASSMONEY = 0
STAT DONTPASSMONEY = 0
STAT COMEMONEY = 0
STAT DONTCOMEMONEY = 0
STAT isTrue = 1
STAT isGame = 1
STAT pChoice = 0
STAT ROLLOOP = 0
STAT PUCK = 0
STAT POINTSET = 0
STAT COMEGAME = 0
STAT COMEPOINT = 0
STAT COMEPUCK = 0
STAT BETCHECK = 0

RESPAWN-WHILE(isGame == 1){
  STAT ROLLOOP = 0

  DETECTION-METER |"=== CRAPS TABLE ===" "->" "1. PASS LINE" "->" "2. DON'T PASS" "->" "3. ROLL" "->" "4. QUIT" "->"|
  DETECTION-METER |"BALANCE: " BALANCE "->"|
  ENTER-QUEST pChoice

  SHOOT-IF(pChoice == 1){
    DETECTION-METER |"PASS LINE BET" "->" "1. $100" "->" "2. $200" "->"|
    ENTER-QUEST pChoice

    SHOOT-IF(pChoice == 1){
      SHOOT-IF(BALANCE < 100){
        DETECTION-METER |"NOT ENOUGH BALANCE" "->"|
        DESPAWN GAME
      }
      STAT BALANCE = BALANCE + -100
      STAT PASSMONEY = PASSMONEY + 100
      STAT pChoice = 0
      STAT BETCHECK = 1
    }

    SHOOT-IF(pChoice == 2){
      SHOOT-IF(BALANCE < 200){
        DETECTION-METER |"NOT ENOUGH BALANCE" "->"|
        DESPAWN GAME
      }
      STAT BALANCE = BALANCE + -200
      STAT PASSMONEY = PASSMONEY + 200
      STAT pChoice = 0
      STAT BETCHECK = 1
    }
  }

  SHOOT-IF(pChoice == 2){
    DETECTION-METER |"DON'T PASS BET" "->" "1. $100" "->" "2. $200" "->"|
    ENTER-QUEST pChoice

    SHOOT-IF(pChoice == 1){
      SHOOT-IF(BALANCE < 100){
        DETECTION-METER |"NOT ENOUGH BALANCE" "->"|
        DESPAWN GAME
      }
      STAT BALANCE = BALANCE + -100
      STAT DONTPASSMONEY = DONTPASSMONEY + 100
      STAT pChoice = 0
      STAT BETCHECK = 1
    }

    SHOOT-IF(pChoice == 2){
      SHOOT-IF(BALANCE < 200){
        DETECTION-METER |"NOT ENOUGH BALANCE" "->"|
        DESPAWN GAME
      }
      STAT BALANCE = BALANCE + -200
      STAT DONTPASSMONEY = DONTPASSMONEY + 200
      STAT pChoice = 0
      STAT BETCHECK = 1
    }
  }

  SHOOT-IF(pChoice == 3){
    SHOOT-IF(BETCHECK == 1){
      STAT DIE1 = ROLL
      STAT DIE2 = ROLL
      STAT DICE = DIE1 + DIE2

      DETECTION-METER |"YOU ROLLED: " DICE "->"|

      SHOOT-IF(POINTSET == 0){
        SHOOT-IF(DICE == 7){
          DETECTION-METER |"PASS LINE WINS" "->"|
          STAT BALANCE = BALANCE + PASSMONEY + PASSMONEY
          STAT PASSMONEY = 0
          STAT DONTPASSMONEY = 0
          STAT pChoice = 0
          STAT BETCHECK = 0
        }
        SHOOT-IF(DICE == 11){
          DETECTION-METER |"PASS LINE WINS" "->"|
          STAT BALANCE = BALANCE + PASSMONEY + PASSMONEY
          STAT PASSMONEY = 0
          STAT DONTPASSMONEY = 0
          STAT pChoice = 0
          STAT BETCHECK = 0
        }
        SHOOT-IF(DICE == 2){
          DETECTION-METER |"DON'T PASS WINS" "->"|
          STAT BALANCE = BALANCE + DONTPASSMONEY + DONTPASSMONEY
          STAT PASSMONEY = 0
          STAT DONTPASSMONEY = 0
          STAT pChoice = 0
          STAT BETCHECK = 0
        }
        SHOOT-IF(DICE == 3){
          DETECTION-METER |"DON'T PASS WINS" "->"|
          STAT BALANCE = BALANCE + DONTPASSMONEY + DONTPASSMONEY
          STAT PASSMONEY = 0
          STAT DONTPASSMONEY = 0
          STAT pChoice = 0
          STAT BETCHECK = 0
        }
        SHOOT-IF(DICE == 12){
          DETECTION-METER |"DON'T PASS WINS" "->"|
          STAT BALANCE = BALANCE + DONTPASSMONEY + DONTPASSMONEY
          STAT PASSMONEY = 0
          STAT DONTPASSMONEY = 0
          STAT pChoice = 0
          STAT BETCHECK = 0
        }

        SHOOT-IF(DICE != 2){
          SHOOT-IF(DICE != 3){
            SHOOT-IF(DICE != 7){
              SHOOT-IF(DICE != 11){
                SHOOT-IF(DICE != 12){
                  DETECTION-METER |"POINT SET TO: " DICE "->"|
                  STAT PUCK = DICE
                  STAT POINTSET = 1
                  STAT pChoice = 0
                  STAT BETCHECK = 0
                }
              }
            }
          }
        }
      }

      RESPAWN-WHILE(POINTSET == 1){
        DETECTION-METER |"=== COME BET MENU ===" "->" "1. COME" "->" "2. DON'T COME" "->" "3. ROLL" "->"|
        DETECTION-METER |"BALANCE: " BALANCE "->"|
        ENTER-QUEST pChoice

        SHOOT-IF(pChoice == 1){
          DETECTION-METER |"COME BET" "->" "1. $100" "->" "2. $200" "->"|
          ENTER-QUEST pChoice

          SHOOT-IF(pChoice == 1){
            SHOOT-IF(BALANCE < 100){
              DETECTION-METER |"NOT ENOUGH BALANCE" "->"|
              DESPAWN GAME
            }
            STAT BALANCE = BALANCE + -100
            STAT COMEMONEY = COMEMONEY + 100
            STAT pChoice = 0
          }

          SHOOT-IF(pChoice == 2){
            SHOOT-IF(BALANCE < 200){
              DETECTION-METER |"NOT ENOUGH BALANCE" "->"|
              DESPAWN GAME
            }
            STAT BALANCE = BALANCE + -200
            STAT COMEMONEY = COMEMONEY + 200
            STAT pChoice = 0
          }
        }

        SHOOT-IF(pChoice == 2){
          DETECTION-METER |"DON'T COME BET" "->" "1. $100" "->" "2. $200" "->"|
          ENTER-QUEST pChoice

          SHOOT-IF(pChoice == 1){
            SHOOT-IF(BALANCE < 100){
              DETECTION-METER |"NOT ENOUGH BALANCE" "->"|
              DESPAWN GAME
            }
            STAT BALANCE = BALANCE + -100
            STAT DONTCOMEMONEY = DONTCOMEMONEY + 100
            STAT pChoice = 0
          }

          SHOOT-IF(pChoice == 2){
            SHOOT-IF(BALANCE < 200){
              DETECTION-METER |"NOT ENOUGH BALANCE" "->"|
              DESPAWN GAME
            }
            STAT BALANCE = BALANCE + -200
            STAT DONTCOMEMONEY = DONTCOMEMONEY + 200
            STAT pChoice = 0
          }
        }

        SHOOT-IF(pChoice == 3){
          STAT DIE1 = ROLL
          STAT DIE2 = ROLL
          STAT DICE = DIE1 + DIE2

          DETECTION-METER |"YOU ROLLED: " DICE "->"|

          SHOOT-IF(DICE == 7){
            DETECTION-METER |"SEVEN OUT! DON'T PASS WINS!" "->"|
            STAT BALANCE = BALANCE + DONTPASSMONEY + DONTPASSMONEY
            STAT PASSMONEY = 0
            STAT DONTPASSMONEY = 0
            STAT COMEMONEY = 0
            STAT DONTCOMEMONEY = 0
            STAT pChoice = 0
            STAT POINTSET = 0
            STAT COMEGAME = 0
            STAT BETCHECK = 0
          }

          SHOOT-IF(DICE == PUCK){
            DETECTION-METER |"PASS LINE HITS POINT! WIN!" "->"|
            STAT BALANCE = BALANCE + PASSMONEY + PASSMONEY
            STAT PASSMONEY = 0
            STAT DONTPASSMONEY = 0
            STAT COMEMONEY = 0
            STAT DONTCOMEMONEY = 0
            STAT pChoice = 0
            STAT POINTSET = 0
            STAT COMEGAME = 0
            STAT BETCHECK = 0
          }

          SHOOT-IF(COMEGAME == 1){
            SHOOT-IF(DICE == 7){
              DETECTION-METER |"DON'T COME WINS" "->"|
              STAT BALANCE = BALANCE + DONTCOMEMONEY + DONTCOMEMONEY
              STAT COMEMONEY = 0
              STAT DONTCOMEMONEY = 0
              STAT COMEGAME = 0
            }

            SHOOT-IF(DICE == COMEPUCK){
              DETECTION-METER |"COME HITS POINT! WINS!" "->"|
              STAT BALANCE = BALANCE + COMEMONEY + COMEMONEY
              STAT COMEMONEY = 0
              STAT DONTCOMEMONEY = 0
              STAT COMEGAME = 0
            }

            SHOOT-IF(DICE != 7){
              SHOOT-IF(DICE != COMEPUCK){
                SHOOT-IF(DICE != 2){
                  SHOOT-IF(DICE != 3){
                    SHOOT-IF(DICE != 12){
                      DETECTION-METER |"COME POINT SET TO: " DICE "->"|
                      STAT COMEPUCK = DICE
                      STAT COMEGAME = 1
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  SHOOT-IF(pChoice == 4){
    DETECTION-METER |"THANKS FOR PLAYING!" "->"|
    STAT isGame = 0
    DESPAWN GAME
  }
}
