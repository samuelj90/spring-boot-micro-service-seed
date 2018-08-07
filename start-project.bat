@echo off
set back=%cd%
for /d %%i in (.\*) do (
    cd "%%i"
    if exist start.bat (
       START start.bat
    )
    cd %back%
    pause
)
cd %back%