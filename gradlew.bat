@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%"=="" set _CLSTR=--debug

@setlocal enableextensions enabledelayedexpansion
@for /F "usebackq delims=" %%A in ("%~dp0gradle/wrapper/gradle-wrapper.properties") do (
    if "%%A" neq "" (
        for /F "tokens=1* delims==" %%B in ("%%A") do (
            if "%%B"=="distributionUrl" set DISTRIBUTION_URL=%%C
        )
    )
)

if not defined DISTRIBUTION_URL (
    set DISTRIBUTION_URL=https://services.gradle.org/distributions/gradle-8.7-bin.zip
)

if not defined GRADLE_HOME (
    set GRADLE_HOME=%~dp0
)

set GRADLE_WRAPPER_JAR=%GRADLE_HOME%gradle\wrapper\gradle-wrapper.jar
set GRADLE_PROPERTIES=%GRADLE_HOME%gradle.properties
set JAVA_EXE=C:\Program Files\Java\jdk-21.0.11\bin\java.exe

if not defined JAVA_EXE (
    echo Error: JAVA_EXE is not set and java could not be found in your PATH.
    echo.
    echo Please set the JAVA_HOME variable in your environment to match the
    echo location of your Java installation.
    exit /b 1
)

if not exist "%GRADLE_WRAPPER_JAR%" (
    echo Downloading Gradle wrapper...
    powershell -Command "[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12; (New-Object System.Net.WebClient).DownloadFile('%DISTRIBUTION_URL%', '%GRADLE_WRAPPER_JAR%')"
)

"%JAVA_EXE%" -cp "%GRADLE_WRAPPER_JAR%" org.gradle.wrapper.GradleWrapperMain %*
