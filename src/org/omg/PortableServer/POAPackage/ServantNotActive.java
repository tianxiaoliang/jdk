package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ServantNotActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u66/4988/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, October 6, 2015 5:29:16 PM PDT
*/

public final class ServantNotActive extends org.omg.CORBA.UserException
{

  public ServantNotActive ()
  {
    super(ServantNotActiveHelper.id());
  } // ctor


  public ServantNotActive (String $reason)
  {
    super(ServantNotActiveHelper.id() + "  " + $reason);
  } // ctor

} // class ServantNotActive
