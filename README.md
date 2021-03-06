``` 
* Generated by
* 
*      _____ _          __  __      _     _
*     / ____| |        / _|/ _|    | |   | |
*    | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __
*     \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
*     ____) |   < (_| | | | || (_) | | (_| |  __/ |
*    |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|
*
* The code generator that works in many programming languages
*
*			https://www.skaffolder.com
*
*
* You can generate the code from the command-line
*       https://npmjs.com/package/skaffolder-cli
*
*       npm install -g skaffodler-cli
*
*   *   *   *   *   *   *   *   *   *   *   *   *   *   *   *
*
* To remove this comment please upgrade your plan here: 
*      https://app.skaffolder.com/#!/upgrade
*
* Or get up to 70% discount sharing your unique link:
*       https://app.skaffolder.com/#!/register?friend=5e55338952a8e9561a0d078c
*
* You will get 10% discount for each one of your friends
* 
```


```
   _____ _          __  __      _     _           
  / ____| |        / _|/ _|    | |   | |          
 | (___ | | ____ _| |_| |_ ___ | | __| | ___ _ __ 
  \___ \| |/ / _` |  _|  _/ _ \| |/ _` |/ _ \ '__|
  ____) |   < (_| | | | || (_) | | (_| |  __/ |   
 |_____/|_|\_\__,_|_| |_| \___/|_|\__,_|\___|_|   

       _                  
      | |                 
      | | __ ___   ____ _ 
  _   | |/ _` \ \ / / _` |
 | |__| | (_| |\ V / (_| |
  \____/ \__,_| \_/ \__,_|
```

This project was generated by Skaffolder

For more documentation visit https://skaffolder.com/#/documentation

--------------
## PREREQUISITES
--------------
* Apache Maven
* JDK 1.7
* Oracle Database
--------------
## CONFIGURE DATABASE
--------------

* Install in you maven repository the jar `com.oracle.ojdbc14` version 10.2.0.2.0, you can download this jar by registering to Oracle website from http://www.oracle.com/technetwork/apps-tech/jdbc-10201-088211.html

* Install OJDBC jar in maven with:
    ``` bash
    $ mvn install:install-file \
    -Dfile={Path/to/your/ojdbc14.jar} \
    -DgroupId=com.oracle \
    -DartifactId=ojdbc14 \
    -Dversion=10.2.0.2.0 \
    -Dpackaging=jar
    ```

* On database execute the SQL script  `script/schemaDb_Security_db.sql`  generated in folder /script.

* Insert IP, user and pass of database on your properties file in `src/main/webapp/WEB-INF/application.properties`

--------------
## START APPLICATION
--------------

* If you are using Angular 4 frontend type:
    ``` bash
	$ cd src/client
	$ yarn install
    $ yarn run build
    ```

* To start the application open a command line in the project's folder an type:
    ``` bash
    $ mvn jetty:run
    ```
    This will start a lightweight Java server on your pc and run the application.

* Go to http://localhost:8080/Security

--------------
## CONFIGURE
--------------

For Java and database config edit `src/main/webapp/WEB-INF/application.properties`

--------------
## USING SKAFFOLDER-CLI
--------------

With Skaffolder-CLI you can easily manage your Skaffolder project from command line and customize your generator template from your IDE.

Install Skaffolder-CLI with
``` bash
$ yarn install -g skaffolder-cli
```

Login running the command
``` bash
$ sk login
```

Generate your project with the command
``` bash
$ sk generate
```

You can customize your generator template working with files in .skaffolder folder in your project root.

Please refer to https://skaffolder.com/#/documentation/skaffolder-cli for more information.

