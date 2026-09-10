@echo off
chcp 65001 > nul
cd /d "%~dp0"
if not exist out mkdir out

echo [1/2] Java 파일 컴파일 중...
javac -encoding UTF-8 -d out src\sutda\*.java
if errorlevel 1 (
    echo.
    echo 컴파일 실패: JDK가 설치되어 있는지 확인하세요.
    pause
    exit /b 1
)

echo [2/2] 섯다 실행
java -cp out sutda.Main
pause
