#ifndef ANDROID_BN_HELLOWORLD_H
#define ANDROID_BN_HELLOWORLD_H

#include "IHelloWorld.h"

namespace android {

class BnHelloWorld : public BnInterface<IHelloWorld>
{
public:
    virtual status_t onTransact(uint32_t code, const Parcel& data, Parcel* reply, uint32_t flags=0);

    virtual void helloWorld();
    virtual void worldHello();
};

} // end namespace android

#endif
