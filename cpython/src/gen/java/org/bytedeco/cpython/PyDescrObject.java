// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;
 /* wrapper function takes keyword args */

/* Various kinds of descriptor objects */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyDescrObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyDescrObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyDescrObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyDescrObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyDescrObject position(long position) {
        return (PyDescrObject)super.position(position);
    }

    public native @ByRef PyObject ob_base(); public native PyDescrObject ob_base(PyObject setter);
    public native PyTypeObject d_type(); public native PyDescrObject d_type(PyTypeObject setter);
    public native PyObject d_name(); public native PyDescrObject d_name(PyObject setter);
    public native PyObject d_qualname(); public native PyDescrObject d_qualname(PyObject setter);
}
