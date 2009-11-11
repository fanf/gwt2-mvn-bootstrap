Starting example of GWT 2 with maven, UI binder and i18n.

Get it
======

git clone 

Build and test
==============

All maven related commands are to be executed in the root directory (where the pom.xml file is)

Generating Async services
--------------------------
% mvn ....

Generating i18n related classes
-------------------------------
% mvn ...

Compiling
----------
% mvn gwt:compile

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


