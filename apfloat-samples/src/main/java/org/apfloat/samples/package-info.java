/*
 * Apfloat arbitrary precision arithmetic library
 * Copyright (C) 2002-2017  Mikko Tommila
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

/**
Sample applications demonstrating apfloat use.<p>

Three different versions of an application for calculating &pi; are
included. The simplest, {@link org.apfloat.samples.Pi} runs on one
computer using one processor (and one thread) only. {@link org.apfloat.samples.PiParallel}
executes multiple threads in parallel and has vastly better performance
on multi-core computers. Finally, {@link org.apfloat.samples.PiDistributed}
can use multiple separate computers for calculating pi with even
greater processing power.<p>

As a curiosity, two applets are provided for running {@link org.apfloat.samples.Pi}
and {@link org.apfloat.samples.PiParallel} through a graphical user
interface: {@link org.apfloat.samples.PiApplet} and {@link org.apfloat.samples.PiParallelApplet},
correspondingly. These programs can also be run as stand-alone
Java applications: {@link org.apfloat.samples.PiGUI} and {@link org.apfloat.samples.PiParallelGUI}.<p>

Compared to the C++ version of apfloat, the Java version pi calculation
program is usually just as fast. Even in worst cases the Java version achieves
roughly 50% of the performance of the assembler-optimized C++ versions of apfloat.
Modern JVMs are nearly as efficient as optimizing C++ compilers in code generation.
The advantage that JVMs have over native C++ compilers is obviously that the JVM
generates optimal code for every target architecture and runtime profile
automatically, from an intermediate portable binary executable format. With C++,
the source code must be compiled and profiled manually for every target
architecture, which can be difficult and tedious.<p>

On multi-core computers the Java parallel pi calculator is often significantly faster
than the C++ parallel version. The same applies to the distributed pi calculator.
Multi-threaded and distributed applications are more efficient to implement in Java
due to C++'s historical lack of standard libraries for threading and networking.
*/

package org.apfloat.samples;
