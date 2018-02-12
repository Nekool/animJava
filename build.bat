if not exist "build" mkdir build
javac -d build/ src/*.java
jar cfe tuto.jar Main -C build .