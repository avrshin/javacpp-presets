// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class ssizessizeobjargproc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ssizessizeobjargproc(Pointer p) { super(p); }
    protected ssizessizeobjargproc() { allocate(); }
    private native void allocate();
    public native int call(PyObject arg0, @Cast("Py_ssize_t") long arg1, @Cast("Py_ssize_t") long arg2, PyObject arg3);
}
