@echo on
call mvn clean install -T 2C

del /F /Q /S %JBOSS_HOME%\standalone\deployments\*.war
del /F /Q /S %JBOSS_HOME%\standalone\deployments\*.ear

copy .\user-management\ear\target\*.ear %JBOSS_HOME%\standalone\deployments
copy .\controller\target\*.war %JBOSS_HOME%\standalone\deployments
