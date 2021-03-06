/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSkillGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the skill group to delete. Required.
     * </p>
     */
    private String skillGroupArn;

    /**
     * <p>
     * The ARN of the skill group to delete. Required.
     * </p>
     * 
     * @param skillGroupArn
     *        The ARN of the skill group to delete. Required.
     */

    public void setSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
    }

    /**
     * <p>
     * The ARN of the skill group to delete. Required.
     * </p>
     * 
     * @return The ARN of the skill group to delete. Required.
     */

    public String getSkillGroupArn() {
        return this.skillGroupArn;
    }

    /**
     * <p>
     * The ARN of the skill group to delete. Required.
     * </p>
     * 
     * @param skillGroupArn
     *        The ARN of the skill group to delete. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSkillGroupRequest withSkillGroupArn(String skillGroupArn) {
        setSkillGroupArn(skillGroupArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSkillGroupArn() != null)
            sb.append("SkillGroupArn: ").append(getSkillGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSkillGroupRequest == false)
            return false;
        DeleteSkillGroupRequest other = (DeleteSkillGroupRequest) obj;
        if (other.getSkillGroupArn() == null ^ this.getSkillGroupArn() == null)
            return false;
        if (other.getSkillGroupArn() != null && other.getSkillGroupArn().equals(this.getSkillGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillGroupArn() == null) ? 0 : getSkillGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSkillGroupRequest clone() {
        return (DeleteSkillGroupRequest) super.clone();
    }

}
