/*
 * Copyright (c) 2014, 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.openjdk.jcstress.generator.seqcst;

import java.util.Map;

public class TraceResult {

    private final Map<Result, Value> results;
    private final Map<Integer, Value> vars;

    public TraceResult(Map<Result, Value> results, Map<Integer, Value> vars) {
        this.results = results;
        this.vars = vars;
    }

    public Map<Result, Value> getResults() {
        return results;
    }

    public Map<Integer, Value> getVars() {
        return vars;
    }

    @Override
    public String toString() {
        return "{Results: " + results + ", Variables: " + vars + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TraceResult that = (TraceResult) o;

        if (!results.equals(that.results)) return false;
        return vars.equals(that.vars);

    }

    @Override
    public int hashCode() {
        int result = results.hashCode();
        result = 31 * result + vars.hashCode();
        return result;
    }
}
