#define LOG_TAG "HelloWorldService"

#include "HelloWorld.h"

namespace android {

void HelloWorld::helloWorld()
{
    ALOGD("server side helloWorld called");
    // sleep 5 seconds
    usleep(5000000);
    ALOGD("helloWorld sleep end");
}

void HelloWorld::worldHello()
{
    ALOGD("server side worldHello called");
}

HelloWorld::~HelloWorld()
{
}

} // end of namespace android
