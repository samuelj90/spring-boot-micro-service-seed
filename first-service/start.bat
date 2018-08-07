set server.port=9091
set service.instance.name=Instance1
set PATH=%PATH%;%server.port%;%service.instance.name%
START gradlew bootRun 
set server.port=9092
set service.instance.name=Instance2
set PATH=%PATH%;%server.port%;%service.instance.name%
START gradlew bootRun 
EXIT