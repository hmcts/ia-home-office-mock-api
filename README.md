# Home Office Mock Api

[![Build Status](https://travis-ci.org/hmcts/spring-boot-template.svg?branch=master)](https://travis-ci.org/hmcts/spring-boot-template)

## Purpose

A mock generated using Open API specification agreed with the Home Office.  
The intention is that this will be used while the Home Office services are unavailable.

The code is generated by running a gradle task. The generated code is copied by the task into relevant package

```
./gradlew copyApiDocs
```
 
The Controller classes are then modified to return HTTP Status '200 OK' instead of '501 undocumented'

Log is added to track requests.

Run the normal build after this step.

```
./gradlew clean build
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
