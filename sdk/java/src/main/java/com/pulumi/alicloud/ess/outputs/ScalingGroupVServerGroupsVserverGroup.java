// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.alicloud.ess.outputs.ScalingGroupVServerGroupsVserverGroupVserverAttribute;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ScalingGroupVServerGroupsVserverGroup {
    /**
     * @return Loadbalancer server ID of VServer Group.
     * 
     */
    private String loadbalancerId;
    /**
     * @return A list of VServer Group attributes. See `vserver_attributes` below.
     * 
     */
    private List<ScalingGroupVServerGroupsVserverGroupVserverAttribute> vserverAttributes;

    private ScalingGroupVServerGroupsVserverGroup() {}
    /**
     * @return Loadbalancer server ID of VServer Group.
     * 
     */
    public String loadbalancerId() {
        return this.loadbalancerId;
    }
    /**
     * @return A list of VServer Group attributes. See `vserver_attributes` below.
     * 
     */
    public List<ScalingGroupVServerGroupsVserverGroupVserverAttribute> vserverAttributes() {
        return this.vserverAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingGroupVServerGroupsVserverGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String loadbalancerId;
        private List<ScalingGroupVServerGroupsVserverGroupVserverAttribute> vserverAttributes;
        public Builder() {}
        public Builder(ScalingGroupVServerGroupsVserverGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadbalancerId = defaults.loadbalancerId;
    	      this.vserverAttributes = defaults.vserverAttributes;
        }

        @CustomType.Setter
        public Builder loadbalancerId(String loadbalancerId) {
            if (loadbalancerId == null) {
              throw new MissingRequiredPropertyException("ScalingGroupVServerGroupsVserverGroup", "loadbalancerId");
            }
            this.loadbalancerId = loadbalancerId;
            return this;
        }
        @CustomType.Setter
        public Builder vserverAttributes(List<ScalingGroupVServerGroupsVserverGroupVserverAttribute> vserverAttributes) {
            if (vserverAttributes == null) {
              throw new MissingRequiredPropertyException("ScalingGroupVServerGroupsVserverGroup", "vserverAttributes");
            }
            this.vserverAttributes = vserverAttributes;
            return this;
        }
        public Builder vserverAttributes(ScalingGroupVServerGroupsVserverGroupVserverAttribute... vserverAttributes) {
            return vserverAttributes(List.of(vserverAttributes));
        }
        public ScalingGroupVServerGroupsVserverGroup build() {
            final var _resultValue = new ScalingGroupVServerGroupsVserverGroup();
            _resultValue.loadbalancerId = loadbalancerId;
            _resultValue.vserverAttributes = vserverAttributes;
            return _resultValue;
        }
    }
}
