ImMaterial
===============

An exploration of Android design patterns and app design

### Core Structure
This application uses a mix of Java and Android modules. Java modules allow for a simpler implementation and
 faster build time as all tests run as simple Junit tests. Android modules are kept to only those modules
 that need to know about Android code thereby enforcing the separation of processing and UI code.

Core frameworks employed by this application are `rxJava` and `Dagger2`. The `Observable` framework is used for
 communication between the backend modules used to implement `remote` and `cached` processing, which is in turn
 encapsulated in the `conductor` module. The `conductor` module is the pivot point between backend processing
 and UI centered functionality and enables the two areas to be developed in tandem or separately as required. It
 is possible to with this structure to cleanly create mock data backed UI functionality or create a complete
 backend process without a UI component.

Communication between the `UI` and `backend` areas occurs through a `Presenter` implementation which
 communicates to the `View` instances through a `ViewModel` interface.


### Development
The majority of development work is done on the `dev` branch, this branch should always be in a buildable state.

The `master` branch is a release only branch with the version numbers as `tags`

