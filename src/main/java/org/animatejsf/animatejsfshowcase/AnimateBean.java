/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.animatejsf.animatejsfshowcase;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author hatemalimam
 */
@ManagedBean
@ViewScoped
public class AnimateBean implements Serializable{

    /**
     * Creates a new instance of AnimateBean
     */
    
    private String animateType;
    
    public AnimateBean() {
        animateType = "tada";
    }

    public String getAnimateType() {
        return animateType;
    }

    public void setAnimateType(String animateType) {
        this.animateType = animateType;
    }    
    
}
