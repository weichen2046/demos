#ifndef ANDROID_HELLOWORLD_H
#define ANDROID_HELLOWORLD_H

#include <binder/BinderService.h>
#include <cutils/compiler.h>

#include "BnHelloWorld.h"

namespace android {

class HelloWorld :
    public BinderService<HelloWorld>,
    public BnHelloWorld
{
public:
    static const char* getServiceName() ANDROID_API { return "helloworld"; }

    virtual void helloWorld();
    virtual void worldHello();

    virtual ~HelloWorld();
};

} // end of namespace android

#endif
