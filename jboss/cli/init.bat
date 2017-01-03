REM set JBOSS_HOME=<insert absolute path of jBoss>
echo %JBOSS_HOME%

call %JBOSS_HOME%\bin\jboss-cli.bat --file=add-modules.cli

call %JBOSS_HOME%\bin\jboss-cli.bat --file=oracle-driver.cli

call %JBOSS_HOME%\bin\jboss-cli.bat --file=dwk-sample-app-ds.cli