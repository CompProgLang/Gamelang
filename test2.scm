DETECTION-METER |"Choose an option:" "->" "1. Start" "->" "2. Quit" "->"|
ENTER-QUEST choice

SHOOT-IF (choice == 1) {
  DETECTION-METER |"Starting game..." "->"|
}

SHOOT-IF (choice == 2) {
  DETECTION-METER |"Exiting..." "->"|
  DESPAWN GAME
}