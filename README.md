# koin-fragment-crash
Demo implementation for Koin fragment crash when Activity has to be re-created. 
This crash only happens when you inject a Fragment with parameters. An empty constructor works fine.

**Reproduction steps:**
1) Enable 'Don't keep activities' in Android phones Developer options
2) Start app and click 'Go to next activity'
3) Press device back button or 'go back' button

**Expected result:**

First Activtiy is rebuild and shown

**Actual result:**

App crashes:
```
 Caused by: org.koin.core.error.InstanceCreationException: Could not create instance for [Factory:'com.sammekleijn.koinfragmentcrash.main.MainFragment',scope:'com.sammekleijn.koinfragmentcrash.main.MainActivity']
     Caused by: org.koin.core.error.NoParameterFoundException: Can't get parameter value #0 from org.koin.core.parameter.DefinitionParameters@e1020cb
```
     
*Temporary fix:*

Add `savedInstanceState?.remove("android:support:fragments")` before `super.onCreate(savedInstanceState)`
