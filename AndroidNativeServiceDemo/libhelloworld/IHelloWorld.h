#ifndef ANDROID_IHELLOWORLD_H
#define ANDROID_IHELLOWORLD_H

#include <binder/IInterface.h>

namespace android {

class IHelloWorld : public IInterface
{
public:
    DECLARE_META_INTERFACE(HelloWorld);

    virtual void helloWorld() = 0;
    virtual void worldHello() = 0;

    enum {
        HELLO_WORLD_TRANSACTION = IBinder::FIRST_CALL_TRANSACTION,
        WORLD_HELLO_TRANSACTION,
    };
};

} // end namespace android

#endif
