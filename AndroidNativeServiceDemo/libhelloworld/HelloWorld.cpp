#define LOG_TAG "HelloWorldService"

#include "HelloWorld.h"

namespace android {

void HelloWorld::helloWorld()
{
    ALOGD("server side helloWorld called");
}

void HelloWorld::worldHello()
{
    ALOGD("server side worldHello called");
}

HelloWorld::~HelloWorld()
{
}

} // end of namespace android
