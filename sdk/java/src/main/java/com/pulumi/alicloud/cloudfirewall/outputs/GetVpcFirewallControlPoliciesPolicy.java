// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVpcFirewallControlPoliciesPolicy {
    /**
     * @return The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    private String aclAction;
    /**
     * @return Access control over VPC firewalls strategy unique identifier.
     * 
     */
    private String aclUuid;
    /**
     * @return Policy specifies the application ID.
     * 
     */
    private String applicationId;
    /**
     * @return Access control over VPC firewalls policies support the application types.
     * 
     */
    private String applicationName;
    /**
     * @return Access control over VPC firewalls description of the strategy information.
     * 
     */
    private String description;
    /**
     * @return Access control over VPC firewalls strategy access traffic of the destination port.
     * 
     */
    private String destPort;
    /**
     * @return Access control policy in the access traffic of the destination port address book name.
     * 
     */
    private String destPortGroup;
    /**
     * @return Port Address Book port list.
     * 
     */
    private List<String> destPortGroupPorts;
    /**
     * @return Access control over VPC firewalls strategy access traffic of the destination port type.
     * 
     */
    private String destPortType;
    /**
     * @return Access control over VPC firewalls strategy the destination address in.
     * 
     */
    private String destination;
    /**
     * @return Destination address book defined in the address list.
     * 
     */
    private List<String> destinationGroupCidrs;
    /**
     * @return The destination address book type in the access control policy. Value: `ip`, `domain`.
     * 
     */
    private String destinationGroupType;
    /**
     * @return Access control over VPC firewalls strategy in the destination address of the type.
     * 
     */
    private String destinationType;
    /**
     * @return Control strategy of hits per second.
     * 
     */
    private Integer hitTimes;
    /**
     * @return The ID of the Cloud Firewall Vpc Firewall Control Policy.
     * 
     */
    private String id;
    /**
     * @return The UID of the member account of the current Alibaba cloud account.
     * 
     */
    private String memberUid;
    /**
     * @return Access control over VPC firewalls policies will go into effect of priority. The priority value starts from 1, the smaller the priority number, the higher the priority. -1 represents the lowest priority.
     * 
     */
    private Integer order;
    /**
     * @return Access control over VPC firewalls strategy access traffic of the protocol type.
     * 
     */
    private String proto;
    /**
     * @return The enabled status of the access control policy. The policy is enabled by default after it is created. Value:
     * - **true**: Enable access control policies
     * - **false**: does not enable access control policies.
     * 
     */
    private Boolean release;
    /**
     * @return Access control over VPC firewalls strategy in the source address.
     * 
     */
    private String source;
    /**
     * @return SOURCE address of the address list.
     * 
     */
    private List<String> sourceGroupCidrs;
    /**
     * @return The source address type in the access control policy. Unique value: **ip**. The IP address book contains one or more IP address segments.
     * 
     */
    private String sourceGroupType;
    /**
     * @return Access control over VPC firewalls policy source address type.
     * 
     */
    private String sourceType;
    /**
     * @return The ID of the VPC firewall instance. Value:
     * - When the VPC firewall protects traffic between two VPCs connected through the cloud enterprise network, the policy group ID uses the cloud enterprise network instance ID.
     * - When the VPC firewall protects traffic between two VPCs connected through the express connection, the policy group ID uses the ID of the VPC firewall instance.
     * 
     */
    private String vpcFirewallId;

    private GetVpcFirewallControlPoliciesPolicy() {}
    /**
     * @return The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    public String aclAction() {
        return this.aclAction;
    }
    /**
     * @return Access control over VPC firewalls strategy unique identifier.
     * 
     */
    public String aclUuid() {
        return this.aclUuid;
    }
    /**
     * @return Policy specifies the application ID.
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return Access control over VPC firewalls policies support the application types.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * @return Access control over VPC firewalls description of the strategy information.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Access control over VPC firewalls strategy access traffic of the destination port.
     * 
     */
    public String destPort() {
        return this.destPort;
    }
    /**
     * @return Access control policy in the access traffic of the destination port address book name.
     * 
     */
    public String destPortGroup() {
        return this.destPortGroup;
    }
    /**
     * @return Port Address Book port list.
     * 
     */
    public List<String> destPortGroupPorts() {
        return this.destPortGroupPorts;
    }
    /**
     * @return Access control over VPC firewalls strategy access traffic of the destination port type.
     * 
     */
    public String destPortType() {
        return this.destPortType;
    }
    /**
     * @return Access control over VPC firewalls strategy the destination address in.
     * 
     */
    public String destination() {
        return this.destination;
    }
    /**
     * @return Destination address book defined in the address list.
     * 
     */
    public List<String> destinationGroupCidrs() {
        return this.destinationGroupCidrs;
    }
    /**
     * @return The destination address book type in the access control policy. Value: `ip`, `domain`.
     * 
     */
    public String destinationGroupType() {
        return this.destinationGroupType;
    }
    /**
     * @return Access control over VPC firewalls strategy in the destination address of the type.
     * 
     */
    public String destinationType() {
        return this.destinationType;
    }
    /**
     * @return Control strategy of hits per second.
     * 
     */
    public Integer hitTimes() {
        return this.hitTimes;
    }
    /**
     * @return The ID of the Cloud Firewall Vpc Firewall Control Policy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The UID of the member account of the current Alibaba cloud account.
     * 
     */
    public String memberUid() {
        return this.memberUid;
    }
    /**
     * @return Access control over VPC firewalls policies will go into effect of priority. The priority value starts from 1, the smaller the priority number, the higher the priority. -1 represents the lowest priority.
     * 
     */
    public Integer order() {
        return this.order;
    }
    /**
     * @return Access control over VPC firewalls strategy access traffic of the protocol type.
     * 
     */
    public String proto() {
        return this.proto;
    }
    /**
     * @return The enabled status of the access control policy. The policy is enabled by default after it is created. Value:
     * - **true**: Enable access control policies
     * - **false**: does not enable access control policies.
     * 
     */
    public Boolean release() {
        return this.release;
    }
    /**
     * @return Access control over VPC firewalls strategy in the source address.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return SOURCE address of the address list.
     * 
     */
    public List<String> sourceGroupCidrs() {
        return this.sourceGroupCidrs;
    }
    /**
     * @return The source address type in the access control policy. Unique value: **ip**. The IP address book contains one or more IP address segments.
     * 
     */
    public String sourceGroupType() {
        return this.sourceGroupType;
    }
    /**
     * @return Access control over VPC firewalls policy source address type.
     * 
     */
    public String sourceType() {
        return this.sourceType;
    }
    /**
     * @return The ID of the VPC firewall instance. Value:
     * - When the VPC firewall protects traffic between two VPCs connected through the cloud enterprise network, the policy group ID uses the cloud enterprise network instance ID.
     * - When the VPC firewall protects traffic between two VPCs connected through the express connection, the policy group ID uses the ID of the VPC firewall instance.
     * 
     */
    public String vpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcFirewallControlPoliciesPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aclAction;
        private String aclUuid;
        private String applicationId;
        private String applicationName;
        private String description;
        private String destPort;
        private String destPortGroup;
        private List<String> destPortGroupPorts;
        private String destPortType;
        private String destination;
        private List<String> destinationGroupCidrs;
        private String destinationGroupType;
        private String destinationType;
        private Integer hitTimes;
        private String id;
        private String memberUid;
        private Integer order;
        private String proto;
        private Boolean release;
        private String source;
        private List<String> sourceGroupCidrs;
        private String sourceGroupType;
        private String sourceType;
        private String vpcFirewallId;
        public Builder() {}
        public Builder(GetVpcFirewallControlPoliciesPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclAction = defaults.aclAction;
    	      this.aclUuid = defaults.aclUuid;
    	      this.applicationId = defaults.applicationId;
    	      this.applicationName = defaults.applicationName;
    	      this.description = defaults.description;
    	      this.destPort = defaults.destPort;
    	      this.destPortGroup = defaults.destPortGroup;
    	      this.destPortGroupPorts = defaults.destPortGroupPorts;
    	      this.destPortType = defaults.destPortType;
    	      this.destination = defaults.destination;
    	      this.destinationGroupCidrs = defaults.destinationGroupCidrs;
    	      this.destinationGroupType = defaults.destinationGroupType;
    	      this.destinationType = defaults.destinationType;
    	      this.hitTimes = defaults.hitTimes;
    	      this.id = defaults.id;
    	      this.memberUid = defaults.memberUid;
    	      this.order = defaults.order;
    	      this.proto = defaults.proto;
    	      this.release = defaults.release;
    	      this.source = defaults.source;
    	      this.sourceGroupCidrs = defaults.sourceGroupCidrs;
    	      this.sourceGroupType = defaults.sourceGroupType;
    	      this.sourceType = defaults.sourceType;
    	      this.vpcFirewallId = defaults.vpcFirewallId;
        }

        @CustomType.Setter
        public Builder aclAction(String aclAction) {
            if (aclAction == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "aclAction");
            }
            this.aclAction = aclAction;
            return this;
        }
        @CustomType.Setter
        public Builder aclUuid(String aclUuid) {
            if (aclUuid == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "aclUuid");
            }
            this.aclUuid = aclUuid;
            return this;
        }
        @CustomType.Setter
        public Builder applicationId(String applicationId) {
            if (applicationId == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "applicationId");
            }
            this.applicationId = applicationId;
            return this;
        }
        @CustomType.Setter
        public Builder applicationName(String applicationName) {
            if (applicationName == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "applicationName");
            }
            this.applicationName = applicationName;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder destPort(String destPort) {
            if (destPort == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "destPort");
            }
            this.destPort = destPort;
            return this;
        }
        @CustomType.Setter
        public Builder destPortGroup(String destPortGroup) {
            if (destPortGroup == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "destPortGroup");
            }
            this.destPortGroup = destPortGroup;
            return this;
        }
        @CustomType.Setter
        public Builder destPortGroupPorts(List<String> destPortGroupPorts) {
            if (destPortGroupPorts == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "destPortGroupPorts");
            }
            this.destPortGroupPorts = destPortGroupPorts;
            return this;
        }
        public Builder destPortGroupPorts(String... destPortGroupPorts) {
            return destPortGroupPorts(List.of(destPortGroupPorts));
        }
        @CustomType.Setter
        public Builder destPortType(String destPortType) {
            if (destPortType == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "destPortType");
            }
            this.destPortType = destPortType;
            return this;
        }
        @CustomType.Setter
        public Builder destination(String destination) {
            if (destination == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "destination");
            }
            this.destination = destination;
            return this;
        }
        @CustomType.Setter
        public Builder destinationGroupCidrs(List<String> destinationGroupCidrs) {
            if (destinationGroupCidrs == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "destinationGroupCidrs");
            }
            this.destinationGroupCidrs = destinationGroupCidrs;
            return this;
        }
        public Builder destinationGroupCidrs(String... destinationGroupCidrs) {
            return destinationGroupCidrs(List.of(destinationGroupCidrs));
        }
        @CustomType.Setter
        public Builder destinationGroupType(String destinationGroupType) {
            if (destinationGroupType == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "destinationGroupType");
            }
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        @CustomType.Setter
        public Builder destinationType(String destinationType) {
            if (destinationType == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "destinationType");
            }
            this.destinationType = destinationType;
            return this;
        }
        @CustomType.Setter
        public Builder hitTimes(Integer hitTimes) {
            if (hitTimes == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "hitTimes");
            }
            this.hitTimes = hitTimes;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder memberUid(String memberUid) {
            if (memberUid == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "memberUid");
            }
            this.memberUid = memberUid;
            return this;
        }
        @CustomType.Setter
        public Builder order(Integer order) {
            if (order == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "order");
            }
            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder proto(String proto) {
            if (proto == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "proto");
            }
            this.proto = proto;
            return this;
        }
        @CustomType.Setter
        public Builder release(Boolean release) {
            if (release == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "release");
            }
            this.release = release;
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "source");
            }
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder sourceGroupCidrs(List<String> sourceGroupCidrs) {
            if (sourceGroupCidrs == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "sourceGroupCidrs");
            }
            this.sourceGroupCidrs = sourceGroupCidrs;
            return this;
        }
        public Builder sourceGroupCidrs(String... sourceGroupCidrs) {
            return sourceGroupCidrs(List.of(sourceGroupCidrs));
        }
        @CustomType.Setter
        public Builder sourceGroupType(String sourceGroupType) {
            if (sourceGroupType == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "sourceGroupType");
            }
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            if (sourceType == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "sourceType");
            }
            this.sourceType = sourceType;
            return this;
        }
        @CustomType.Setter
        public Builder vpcFirewallId(String vpcFirewallId) {
            if (vpcFirewallId == null) {
              throw new MissingRequiredPropertyException("GetVpcFirewallControlPoliciesPolicy", "vpcFirewallId");
            }
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public GetVpcFirewallControlPoliciesPolicy build() {
            final var _resultValue = new GetVpcFirewallControlPoliciesPolicy();
            _resultValue.aclAction = aclAction;
            _resultValue.aclUuid = aclUuid;
            _resultValue.applicationId = applicationId;
            _resultValue.applicationName = applicationName;
            _resultValue.description = description;
            _resultValue.destPort = destPort;
            _resultValue.destPortGroup = destPortGroup;
            _resultValue.destPortGroupPorts = destPortGroupPorts;
            _resultValue.destPortType = destPortType;
            _resultValue.destination = destination;
            _resultValue.destinationGroupCidrs = destinationGroupCidrs;
            _resultValue.destinationGroupType = destinationGroupType;
            _resultValue.destinationType = destinationType;
            _resultValue.hitTimes = hitTimes;
            _resultValue.id = id;
            _resultValue.memberUid = memberUid;
            _resultValue.order = order;
            _resultValue.proto = proto;
            _resultValue.release = release;
            _resultValue.source = source;
            _resultValue.sourceGroupCidrs = sourceGroupCidrs;
            _resultValue.sourceGroupType = sourceGroupType;
            _resultValue.sourceType = sourceType;
            _resultValue.vpcFirewallId = vpcFirewallId;
            return _resultValue;
        }
    }
}
