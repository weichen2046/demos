#define LOG_TAG "HelloWorldService"

#include "BnHelloWorld.h"

namespace android {

status_t BnHelloWorld::onTransact(uint32_t code, const Parcel& data, Parcel* reply, uint32_t flags)
{
    switch(code)
    {
        case HELLO_WORLD_TRANSACTION: {
            // TODO: read data from client
            this->helloWorld();
            return NO_ERROR;
        } break;

        case WORLD_HELLO_TRANSACTION: {
            // TODO: read data from client
            this->worldHello();
            return NO_ERROR;
        } break;

        default:
            return BBinder::onTransact(code, data, reply, flags);
    }
}

void BnHelloWorld::helloWorld()
{
    ALOGD("server side helloWorld called");
}

void BnHelloWorld::worldHello()
{
    ALOGD("server side worldHello called");
}

} // end namespace android
