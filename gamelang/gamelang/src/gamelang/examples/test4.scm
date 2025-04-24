DETECTION-METER |"Pick a number for the beginning and end" "->"|
ENTER-QUEST START
ENTER-QUEST END 
	RESPAWN-WHILE (START != END){
		SHOOT-IF (START % 2 == 0){
			DETECTION-METER |START "EVEN" "->"|
		}
		SHOOT-IF (START % 2 == 1){
			DETECTION-METER |START "ODD" "->"|
		}
		STAT START = START + 1
	}
DESPAWN GAME