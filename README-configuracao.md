# POC_Mobile_Appium_Java_JUnit

Configurações para o Linux Ubuntu:

Instalar Node 
```
    sudo apt install nodejs
```
Instalar Appium
```
    npm install -g appium
```

Instalar Appium-desktop
```
    https://github.com/appium/appium-desktop/releases/tag/v1.21.0-1
```


Instalar Appium-Doctor
```
    sudo npm install appium-doctor -g
```

Verificar o que precisa para rodar o Appium
```
    appium-doctor
```

Instalar as dependências do projeto com Maven
```
    mvn install
```

Instalar

Instalando o JDK no Linux
```
    sudo apt update
    sudo apt search openjdk

    sudo apt install openjdk-8-jdk
    export JAVA_HOME=usr/lib/jvm/java-8-openjdk-amd64/
```
OU
```
sudo apt install openjdk-11-jdk
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
java -version
```

Editar os arquivos das variáveis de ambiente no Linux
```
sudo gedit ~/.bashrc
```

Atualizar os arquivos no 'bashrc' no Linux
```
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export PATH=$PATH:$JAVA_HOME/bin
ou 
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
export PATH=$PATH:$JAVA_HOME/bin
e
export ANDROID_HOME=/usr/home/lorenae/Android/Sdk
export PATH=$PATH:$ANDROID_HOME/emulator
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/tools/bin
export PATH=$PATH:$ANDROID_HOME/platform-tools
```

Atualizar os arquivos das variáveis de ambiente no Linux
```
source ~/.bashrc
```

Verificar as instalações no Linux
```
echo $ANDROID_HOME
echo $JAVA_HOME
npx appium-doctor
```

Iniciar o Android Studio no Linux
```
cd android-studio/bin
./studio.sh
```

Instalar o KVM para o AVD do Android Studio no Linux
```
sudo apt-get install qemu-kvm libvirt-bin ubuntu-vm-builder bridge-utils
sudo apt-get install cpu-checker
```

Resolver dependências do projeto
```
mvn install
ou 
mvn dependency:resolve
```

UIAutomatorViewer para inspecionar o apk
```
cd Android/Sdk/tools/bin
./uiautomatorviewer
```

Caso não execute configure o java 8 como padrão de JVM
```
sudo update-alternatives --config java
```

Rodar o Appium antes de iniciar os testes
```
appium
```

Rode os testes no JUnit