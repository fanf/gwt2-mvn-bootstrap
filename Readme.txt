Starting example of GWT 2 with maven, UI binder and i18n.

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


Adding a new language
---------------------

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


