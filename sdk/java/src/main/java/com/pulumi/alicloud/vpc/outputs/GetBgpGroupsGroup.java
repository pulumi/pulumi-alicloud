// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBgpGroupsGroup {
    /**
     * @return The key used by the BGP group.
     * 
     */
    private String authKey;
    /**
     * @return The name of the BGP group.
     * 
     */
    private String bgpGroupName;
    /**
     * @return Description of the BGP group.
     * 
     */
    private String description;
    /**
     * @return The hold time to wait for the incoming BGP message. If no message has been passed in after the hold time, the BGP neighbor is considered disconnected.
     * 
     */
    private String hold;
    /**
     * @return The ID of the Bgp Group.
     * 
     */
    private String id;
    /**
     * @return IP version.
     * 
     */
    private String ipVersion;
    /**
     * @return Whether the AS number is false.
     * 
     */
    private Boolean isFakeAsn;
    /**
     * @return The keepalive time.
     * 
     */
    private String keepalive;
    /**
     * @return The local AS number.
     * 
     */
    private Integer localAsn;
    /**
     * @return The autonomous system (AS) number of the BGP peer.
     * 
     */
    private Integer peerAsn;
    /**
     * @return Routing limits.
     * 
     */
    private String routeLimit;
    /**
     * @return The ID of the VBR.
     * 
     */
    private String routerId;
    /**
     * @return The status of the resource.
     * 
     */
    private String status;

    private GetBgpGroupsGroup() {}
    /**
     * @return The key used by the BGP group.
     * 
     */
    public String authKey() {
        return this.authKey;
    }
    /**
     * @return The name of the BGP group.
     * 
     */
    public String bgpGroupName() {
        return this.bgpGroupName;
    }
    /**
     * @return Description of the BGP group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The hold time to wait for the incoming BGP message. If no message has been passed in after the hold time, the BGP neighbor is considered disconnected.
     * 
     */
    public String hold() {
        return this.hold;
    }
    /**
     * @return The ID of the Bgp Group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IP version.
     * 
     */
    public String ipVersion() {
        return this.ipVersion;
    }
    /**
     * @return Whether the AS number is false.
     * 
     */
    public Boolean isFakeAsn() {
        return this.isFakeAsn;
    }
    /**
     * @return The keepalive time.
     * 
     */
    public String keepalive() {
        return this.keepalive;
    }
    /**
     * @return The local AS number.
     * 
     */
    public Integer localAsn() {
        return this.localAsn;
    }
    /**
     * @return The autonomous system (AS) number of the BGP peer.
     * 
     */
    public Integer peerAsn() {
        return this.peerAsn;
    }
    /**
     * @return Routing limits.
     * 
     */
    public String routeLimit() {
        return this.routeLimit;
    }
    /**
     * @return The ID of the VBR.
     * 
     */
    public String routerId() {
        return this.routerId;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBgpGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authKey;
        private String bgpGroupName;
        private String description;
        private String hold;
        private String id;
        private String ipVersion;
        private Boolean isFakeAsn;
        private String keepalive;
        private Integer localAsn;
        private Integer peerAsn;
        private String routeLimit;
        private String routerId;
        private String status;
        public Builder() {}
        public Builder(GetBgpGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authKey = defaults.authKey;
    	      this.bgpGroupName = defaults.bgpGroupName;
    	      this.description = defaults.description;
    	      this.hold = defaults.hold;
    	      this.id = defaults.id;
    	      this.ipVersion = defaults.ipVersion;
    	      this.isFakeAsn = defaults.isFakeAsn;
    	      this.keepalive = defaults.keepalive;
    	      this.localAsn = defaults.localAsn;
    	      this.peerAsn = defaults.peerAsn;
    	      this.routeLimit = defaults.routeLimit;
    	      this.routerId = defaults.routerId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder authKey(String authKey) {
            if (authKey == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "authKey");
            }
            this.authKey = authKey;
            return this;
        }
        @CustomType.Setter
        public Builder bgpGroupName(String bgpGroupName) {
            if (bgpGroupName == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "bgpGroupName");
            }
            this.bgpGroupName = bgpGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder hold(String hold) {
            if (hold == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "hold");
            }
            this.hold = hold;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipVersion(String ipVersion) {
            if (ipVersion == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "ipVersion");
            }
            this.ipVersion = ipVersion;
            return this;
        }
        @CustomType.Setter
        public Builder isFakeAsn(Boolean isFakeAsn) {
            if (isFakeAsn == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "isFakeAsn");
            }
            this.isFakeAsn = isFakeAsn;
            return this;
        }
        @CustomType.Setter
        public Builder keepalive(String keepalive) {
            if (keepalive == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "keepalive");
            }
            this.keepalive = keepalive;
            return this;
        }
        @CustomType.Setter
        public Builder localAsn(Integer localAsn) {
            if (localAsn == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "localAsn");
            }
            this.localAsn = localAsn;
            return this;
        }
        @CustomType.Setter
        public Builder peerAsn(Integer peerAsn) {
            if (peerAsn == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "peerAsn");
            }
            this.peerAsn = peerAsn;
            return this;
        }
        @CustomType.Setter
        public Builder routeLimit(String routeLimit) {
            if (routeLimit == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "routeLimit");
            }
            this.routeLimit = routeLimit;
            return this;
        }
        @CustomType.Setter
        public Builder routerId(String routerId) {
            if (routerId == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "routerId");
            }
            this.routerId = routerId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetBgpGroupsGroup", "status");
            }
            this.status = status;
            return this;
        }
        public GetBgpGroupsGroup build() {
            final var _resultValue = new GetBgpGroupsGroup();
            _resultValue.authKey = authKey;
            _resultValue.bgpGroupName = bgpGroupName;
            _resultValue.description = description;
            _resultValue.hold = hold;
            _resultValue.id = id;
            _resultValue.ipVersion = ipVersion;
            _resultValue.isFakeAsn = isFakeAsn;
            _resultValue.keepalive = keepalive;
            _resultValue.localAsn = localAsn;
            _resultValue.peerAsn = peerAsn;
            _resultValue.routeLimit = routeLimit;
            _resultValue.routerId = routerId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}