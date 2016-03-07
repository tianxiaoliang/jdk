package org.omg.CORBA;


/**
* org/omg/CORBA/ParameterModeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u66/4988/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Tuesday, October 6, 2015 5:29:15 PM PDT
*/


/**
   * Enumeration of parameter modes for Parameter.  Possible vaues:
   * <ul>
   *   <li>PARAM_IN - Represents an "in" parameter.</li>
   *   <li>PARAM_OUT - Represents an "out" parameter.</li>
   *   <li>PARAM_INOUT - Represents an "inout" parameter.</li>
   * </ul>
   */
abstract public class ParameterModeHelper
{
  private static String  _id = "IDL:omg.org/CORBA/ParameterMode:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.ParameterMode that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CORBA.ParameterMode extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (org.omg.CORBA.ParameterModeHelper.id (), "ParameterMode", new String[] { "PARAM_IN", "PARAM_OUT", "PARAM_INOUT"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CORBA.ParameterMode read (org.omg.CORBA.portable.InputStream istream)
  {
    return org.omg.CORBA.ParameterMode.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.ParameterMode value)
  {
    ostream.write_long (value.value ());
  }

}
