// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo.outputs;

import com.pulumi.alicloud.eflo.outputs.ClusterNetworksNewVpdInfoVpdSubnet;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNetworksNewVpdInfo {
    /**
     * @return Cloud Enterprise Network ID
     * 
     */
    private @Nullable String cenId;
    /**
     * @return Cloud chain cidr
     * 
     */
    private @Nullable String cloudLinkCidr;
    /**
     * @return Cloud chain ID
     * 
     */
    private @Nullable String cloudLinkId;
    /**
     * @return Proprietary Network
     * 
     */
    private @Nullable String monitorVpcId;
    /**
     * @return Proprietary network switch
     * 
     */
    private @Nullable String monitorVswitchId;
    /**
     * @return Cluster network segment
     * 
     */
    private @Nullable String vpdCidr;
    /**
     * @return List of cluster subnet ID
     * 
     */
    private @Nullable List<ClusterNetworksNewVpdInfoVpdSubnet> vpdSubnets;

    private ClusterNetworksNewVpdInfo() {}
    /**
     * @return Cloud Enterprise Network ID
     * 
     */
    public Optional<String> cenId() {
        return Optional.ofNullable(this.cenId);
    }
    /**
     * @return Cloud chain cidr
     * 
     */
    public Optional<String> cloudLinkCidr() {
        return Optional.ofNullable(this.cloudLinkCidr);
    }
    /**
     * @return Cloud chain ID
     * 
     */
    public Optional<String> cloudLinkId() {
        return Optional.ofNullable(this.cloudLinkId);
    }
    /**
     * @return Proprietary Network
     * 
     */
    public Optional<String> monitorVpcId() {
        return Optional.ofNullable(this.monitorVpcId);
    }
    /**
     * @return Proprietary network switch
     * 
     */
    public Optional<String> monitorVswitchId() {
        return Optional.ofNullable(this.monitorVswitchId);
    }
    /**
     * @return Cluster network segment
     * 
     */
    public Optional<String> vpdCidr() {
        return Optional.ofNullable(this.vpdCidr);
    }
    /**
     * @return List of cluster subnet ID
     * 
     */
    public List<ClusterNetworksNewVpdInfoVpdSubnet> vpdSubnets() {
        return this.vpdSubnets == null ? List.of() : this.vpdSubnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNetworksNewVpdInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cenId;
        private @Nullable String cloudLinkCidr;
        private @Nullable String cloudLinkId;
        private @Nullable String monitorVpcId;
        private @Nullable String monitorVswitchId;
        private @Nullable String vpdCidr;
        private @Nullable List<ClusterNetworksNewVpdInfoVpdSubnet> vpdSubnets;
        public Builder() {}
        public Builder(ClusterNetworksNewVpdInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cenId = defaults.cenId;
    	      this.cloudLinkCidr = defaults.cloudLinkCidr;
    	      this.cloudLinkId = defaults.cloudLinkId;
    	      this.monitorVpcId = defaults.monitorVpcId;
    	      this.monitorVswitchId = defaults.monitorVswitchId;
    	      this.vpdCidr = defaults.vpdCidr;
    	      this.vpdSubnets = defaults.vpdSubnets;
        }

        @CustomType.Setter
        public Builder cenId(@Nullable String cenId) {

            this.cenId = cenId;
            return this;
        }
        @CustomType.Setter
        public Builder cloudLinkCidr(@Nullable String cloudLinkCidr) {

            this.cloudLinkCidr = cloudLinkCidr;
            return this;
        }
        @CustomType.Setter
        public Builder cloudLinkId(@Nullable String cloudLinkId) {

            this.cloudLinkId = cloudLinkId;
            return this;
        }
        @CustomType.Setter
        public Builder monitorVpcId(@Nullable String monitorVpcId) {

            this.monitorVpcId = monitorVpcId;
            return this;
        }
        @CustomType.Setter
        public Builder monitorVswitchId(@Nullable String monitorVswitchId) {

            this.monitorVswitchId = monitorVswitchId;
            return this;
        }
        @CustomType.Setter
        public Builder vpdCidr(@Nullable String vpdCidr) {

            this.vpdCidr = vpdCidr;
            return this;
        }
        @CustomType.Setter
        public Builder vpdSubnets(@Nullable List<ClusterNetworksNewVpdInfoVpdSubnet> vpdSubnets) {

            this.vpdSubnets = vpdSubnets;
            return this;
        }
        public Builder vpdSubnets(ClusterNetworksNewVpdInfoVpdSubnet... vpdSubnets) {
            return vpdSubnets(List.of(vpdSubnets));
        }
        public ClusterNetworksNewVpdInfo build() {
            final var _resultValue = new ClusterNetworksNewVpdInfo();
            _resultValue.cenId = cenId;
            _resultValue.cloudLinkCidr = cloudLinkCidr;
            _resultValue.cloudLinkId = cloudLinkId;
            _resultValue.monitorVpcId = monitorVpcId;
            _resultValue.monitorVswitchId = monitorVswitchId;
            _resultValue.vpdCidr = vpdCidr;
            _resultValue.vpdSubnets = vpdSubnets;
            return _resultValue;
        }
    }
}
