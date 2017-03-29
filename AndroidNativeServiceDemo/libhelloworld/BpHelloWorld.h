#ifndef ANDROID_BP_HELLOWORLD_H
#define ANDROID_BP_HELLOWORLD_H

#include "IHelloWorld.h"

namespace android {

class BpHelloWorld : public BpInterface<IHelloWorld>
{
public:
    BpHelloWorld(const sp<IBinder>& impl);

    virtual void helloWorld();
    virtual void worldHello();
};

} // end namespace android

#endif
