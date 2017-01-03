@echo on
call mvn clean install -T 2C

del /F /Q /S %JBOSS_HOME%\standalone\deployments\*.war

copy .\target\*.war %JBOSS_HOME%\standalone\deployments
