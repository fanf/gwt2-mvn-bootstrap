Starting example of GWT 2 with maven, UI binder and i18n.


Author - Licence
----------------
Francois Armand - http://fanf42.blogspot.com

All resources under my copyrigth are published under the Apache v2, 
use it and enhance it - it would be great to be able to have
a "5 minutes to have a GWT2 with i18n project running".


Install
=======
Get the source:
---------------
git clone git://github.com/fanf/gwt2-mvn-bootstrap.git 

Install environnement
---------------------
Download http://code.google.com/p/google-web-toolkit/downloads/detail?name=gwt-2.0.0-ms2.zip
Unzip the archive, the resulting directory will be you "GWT_HOME"
Make a symbolic link from gwt-dev.jar to gwt-jar-{your environment name}.jar, for
  example: 
  % ln -s gwt-dev.jar gwt-dev-linux.jar
  I think that all the possibilities are "linnux", "windows" and "mac"
In pom.xml, change the path of <google.webtoolkit.home> to your GWT_HOME (note that we can't
  use directly an environment variable like: 
  <google.webtoolkit.home>${env.GWT_HOME}</google.webtoolkit.home> due to this bug:
  http://jira.codehaus.org/browse/MNG-4181
Install the developpement plugin for your browser. 
For firefox, it's here: http://google-web-toolkit.googlecode.com/svn/trunk/plugins/xpcom/prebuilt/gwt-dev-plugin.xpi

You should be able to test with:
% mvn compile gwt:compile
% mvn gwt:run

Build and test
==============

All maven related commands are to be executed in the root directory (where the pom.xml file is)

Generating Async services
--------------------------
% mvn gwt:generateAsync

Compiling
----------
% mvn compile gwt:compile

Testing in dev mode
-------------------
% mvn gwt:run


Testing i18n
------------

There is an example of i18n with a French translation.
To know what are the md5 keys of the property file, just run
% mvn gwt:compile

The generated properties files will be in target/extra/gwt2test

To test with the French local, add "&locale=fr" at the end of the site url, 
for example :
http://localhost:8888/Gwt2test.html?gwt.hosted=127.0.0.1:9997&locale=fr

Adding a new language
---------------------

TODO


Interesting resources
=====================

- about UiBinder
http://code.google.com/p/google-web-toolkit/wiki/UiBinder

- about UiBinder & i18n
http://code.google.com/p/google-web-toolkit/wiki/UiBinderI18n

- about UiBinder and Css


- about maven plugin for GWT(2) :
http://mojo.codehaus.org/gwt-maven-plugin/gwt20.html


I also added relevant example found in GWT sources in the ui-examples directory. 
They may be found in their last version in the GWT public svn repository : 
http://google-web-toolkit.googlecode.com/svn/trunk/
(relevant packages: 
user/test/com/google/gwt/uibinder/test/client and 
samples/mail
)


