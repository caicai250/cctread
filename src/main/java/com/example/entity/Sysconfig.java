package com.example.entity;

public class Sysconfig {
    private String parameter;

    private String parametername;

    private String parametervalue;

    private String parametervalueexplain;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public String getParametername() {
        return parametername;
    }

    public void setParametername(String parametername) {
        this.parametername = parametername == null ? null : parametername.trim();
    }

    public String getParametervalue() {
        return parametervalue;
    }

    public void setParametervalue(String parametervalue) {
        this.parametervalue = parametervalue == null ? null : parametervalue.trim();
    }

    public String getParametervalueexplain() {
        return parametervalueexplain;
    }

    public void setParametervalueexplain(String parametervalueexplain) {
        this.parametervalueexplain = parametervalueexplain == null ? null : parametervalueexplain.trim();
    }
}