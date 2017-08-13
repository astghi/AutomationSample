This is a demo of Automation environment and architecture setup with Appium and TestNG in Java.
The following steps are required for environment 

- Install Java version 1.8
- Android sdk - for adb command access and uiautomatorviewer to find properties of the elements in app UI
- Install Appium with npm 
- Config ~/bash_profile to add Java and Maven executable directories to PATH

  export ANDROID_HOME=/Users/your_user/path_to_android_dir/sdk
  export JAVA_HOME=/path_to_jdk/Contents/Home
  export MVN_HOME=/Users/your_user/path_to_mvn/apache-maven-3.3.9

  export PATH=$PATH:$MVN_HOME/bin
  export PATH=$PATH:$ANDROID_HOME/platform-tools/
  export PATH=$PATH:$ANDROID_HOME/tools/
  export PATH=$PATH:$JAVA_HOME/bin
  
  Project srtucture
  
  - Created a new Maven Project in inteliJ.
  - Set up dependencies in .pom file : testNG, Junit, Appium
  - Created AndroidDriverSetup class to give capabilities for app start and run on the real device, that all the tests will extend
  - Created an Abstract screen class with the driver initialized in, which all the screens will extend
  - Created separate classes for each screen with all the elements and functions defined
  - Created Common utils class to store common methods like click on the element on the screen 
  
  NOTE: only one test is automated #6 from the checklist doc which opens the app and adds one item to the default shopping list.
  
  
  
