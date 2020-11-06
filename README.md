## Test Framework for your Mobile App
#### with appium, and selenium-grid for parallel launch
### Presets
* install jdk8
* install lombok plugin
* customize lombok plugin (Build, Execution, Deployment --> Compiler --> Annotation Processors, Enable annotation processing)
* download last stable version selenium-grid https://www.selenium.dev/downloads/
* install appium
* run selenium-grid with role hub

> ##### for example:
>
> java -jar selenium-server-standalone-3.141.59.jar -port 5566 -role hub
>

* start appium node in project directory

> ##### for example:
>
> appium -p 4719 --nodeconfig src/test/resources/environment/Android_Emulator/test_node.json
>

* add your .apk file in project, directory see below
 
> src/test/resources
>
* install android studio
* download and start android emulator version 10.0 in android studio
* start MobileFirstTest
* enjoy...