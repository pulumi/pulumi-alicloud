// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.alicloud.slb.outputs.GetApplicationLoadBalancersBalancer;
import com.pulumi.alicloud.slb.outputs.GetApplicationLoadBalancersSlb;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationLoadBalancersResult {
    /**
     * @return The IP address that the SLB instance uses to provide services.
     * 
     */
    private @Nullable String address;
    /**
     * @return The address ip version.
     * 
     */
    private @Nullable String addressIpVersion;
    /**
     * @return The address type.
     * 
     */
    private @Nullable String addressType;
    /**
     * @return A list of SLBs. Each element contains the following attributes:
     * 
     */
    private List<GetApplicationLoadBalancersBalancer> balancers;
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of slb IDs.
     * 
     */
    private List<String> ids;
    /**
     * @return The billing method of the Internet-facing SLB instance.
     * 
     */
    private @Nullable String internetChargeType;
    /**
     * @return The name of the SLB.
     * 
     */
    private @Nullable String loadBalancerName;
    /**
     * @return Master availability zone of the SLBs.
     * 
     */
    private @Nullable String masterZoneId;
    private @Nullable String nameRegex;
    /**
     * @return A list of slb names.
     * 
     */
    private List<String> names;
    /**
     * @return Network type of the SLB. Possible values: `vpc` and `classic`.
     * 
     */
    private @Nullable String networkType;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;
    private @Nullable String paymentType;
    /**
     * @return The ID of the resource group.
     * 
     */
    private @Nullable String resourceGroupId;
    /**
     * @return The ID of the Elastic Compute Service (ECS) instance that is specified as a backend server of the CLB instance.
     * 
     */
    private @Nullable String serverId;
    private @Nullable String serverIntranetAddress;
    /**
     * @return Slave availability zone of the SLBs.
     * 
     */
    private @Nullable String slaveZoneId;
    /**
     * @deprecated
     * Field &#39;slbs&#39; has deprecated from v1.123.1 and replace by &#39;balancers&#39;.
     * 
     */
    @Deprecated /* Field 'slbs' has deprecated from v1.123.1 and replace by 'balancers'. */
    private List<GetApplicationLoadBalancersSlb> slbs;
    /**
     * @return SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    private @Nullable String status;
    /**
     * @return The tags of the SLB.
     * 
     */
    private @Nullable Map<String,String> tags;
    private Integer totalCount;
    /**
     * @return ID of the VPC the SLB belongs to.
     * 
     */
    private @Nullable String vpcId;
    /**
     * @return ID of the vSwitch the SLB belongs to.
     * 
     */
    private @Nullable String vswitchId;

    private GetApplicationLoadBalancersResult() {}
    /**
     * @return The IP address that the SLB instance uses to provide services.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The address ip version.
     * 
     */
    public Optional<String> addressIpVersion() {
        return Optional.ofNullable(this.addressIpVersion);
    }
    /**
     * @return The address type.
     * 
     */
    public Optional<String> addressType() {
        return Optional.ofNullable(this.addressType);
    }
    /**
     * @return A list of SLBs. Each element contains the following attributes:
     * 
     */
    public List<GetApplicationLoadBalancersBalancer> balancers() {
        return this.balancers;
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of slb IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return The billing method of the Internet-facing SLB instance.
     * 
     */
    public Optional<String> internetChargeType() {
        return Optional.ofNullable(this.internetChargeType);
    }
    /**
     * @return The name of the SLB.
     * 
     */
    public Optional<String> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }
    /**
     * @return Master availability zone of the SLBs.
     * 
     */
    public Optional<String> masterZoneId() {
        return Optional.ofNullable(this.masterZoneId);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of slb names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    /**
     * @return Network type of the SLB. Possible values: `vpc` and `classic`.
     * 
     */
    public Optional<String> networkType() {
        return Optional.ofNullable(this.networkType);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }
    public Optional<String> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    /**
     * @return The ID of the Elastic Compute Service (ECS) instance that is specified as a backend server of the CLB instance.
     * 
     */
    public Optional<String> serverId() {
        return Optional.ofNullable(this.serverId);
    }
    public Optional<String> serverIntranetAddress() {
        return Optional.ofNullable(this.serverIntranetAddress);
    }
    /**
     * @return Slave availability zone of the SLBs.
     * 
     */
    public Optional<String> slaveZoneId() {
        return Optional.ofNullable(this.slaveZoneId);
    }
    /**
     * @deprecated
     * Field &#39;slbs&#39; has deprecated from v1.123.1 and replace by &#39;balancers&#39;.
     * 
     */
    @Deprecated /* Field 'slbs' has deprecated from v1.123.1 and replace by 'balancers'. */
    public List<GetApplicationLoadBalancersSlb> slbs() {
        return this.slbs;
    }
    /**
     * @return SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The tags of the SLB.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Integer totalCount() {
        return this.totalCount;
    }
    /**
     * @return ID of the VPC the SLB belongs to.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }
    /**
     * @return ID of the vSwitch the SLB belongs to.
     * 
     */
    public Optional<String> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationLoadBalancersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String addressIpVersion;
        private @Nullable String addressType;
        private List<GetApplicationLoadBalancersBalancer> balancers;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String internetChargeType;
        private @Nullable String loadBalancerName;
        private @Nullable String masterZoneId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String networkType;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private @Nullable String paymentType;
        private @Nullable String resourceGroupId;
        private @Nullable String serverId;
        private @Nullable String serverIntranetAddress;
        private @Nullable String slaveZoneId;
        private List<GetApplicationLoadBalancersSlb> slbs;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private Integer totalCount;
        private @Nullable String vpcId;
        private @Nullable String vswitchId;
        public Builder() {}
        public Builder(GetApplicationLoadBalancersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressIpVersion = defaults.addressIpVersion;
    	      this.addressType = defaults.addressType;
    	      this.balancers = defaults.balancers;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.internetChargeType = defaults.internetChargeType;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.masterZoneId = defaults.masterZoneId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.networkType = defaults.networkType;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.paymentType = defaults.paymentType;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.serverId = defaults.serverId;
    	      this.serverIntranetAddress = defaults.serverIntranetAddress;
    	      this.slaveZoneId = defaults.slaveZoneId;
    	      this.slbs = defaults.slbs;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.totalCount = defaults.totalCount;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder addressIpVersion(@Nullable String addressIpVersion) {

            this.addressIpVersion = addressIpVersion;
            return this;
        }
        @CustomType.Setter
        public Builder addressType(@Nullable String addressType) {

            this.addressType = addressType;
            return this;
        }
        @CustomType.Setter
        public Builder balancers(List<GetApplicationLoadBalancersBalancer> balancers) {
            if (balancers == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersResult", "balancers");
            }
            this.balancers = balancers;
            return this;
        }
        public Builder balancers(GetApplicationLoadBalancersBalancer... balancers) {
            return balancers(List.of(balancers));
        }
        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {

            this.enableDetails = enableDetails;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder internetChargeType(@Nullable String internetChargeType) {

            this.internetChargeType = internetChargeType;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerName(@Nullable String loadBalancerName) {

            this.loadBalancerName = loadBalancerName;
            return this;
        }
        @CustomType.Setter
        public Builder masterZoneId(@Nullable String masterZoneId) {

            this.masterZoneId = masterZoneId;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder networkType(@Nullable String networkType) {

            this.networkType = networkType;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder pageNumber(@Nullable Integer pageNumber) {

            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {

            this.pageSize = pageSize;
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(@Nullable String paymentType) {

            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(@Nullable String resourceGroupId) {

            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder serverId(@Nullable String serverId) {

            this.serverId = serverId;
            return this;
        }
        @CustomType.Setter
        public Builder serverIntranetAddress(@Nullable String serverIntranetAddress) {

            this.serverIntranetAddress = serverIntranetAddress;
            return this;
        }
        @CustomType.Setter
        public Builder slaveZoneId(@Nullable String slaveZoneId) {

            this.slaveZoneId = slaveZoneId;
            return this;
        }
        @CustomType.Setter
        public Builder slbs(List<GetApplicationLoadBalancersSlb> slbs) {
            if (slbs == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersResult", "slbs");
            }
            this.slbs = slbs;
            return this;
        }
        public Builder slbs(GetApplicationLoadBalancersSlb... slbs) {
            return slbs(List.of(slbs));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder totalCount(Integer totalCount) {
            if (totalCount == null) {
              throw new MissingRequiredPropertyException("GetApplicationLoadBalancersResult", "totalCount");
            }
            this.totalCount = totalCount;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(@Nullable String vpcId) {

            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(@Nullable String vswitchId) {

            this.vswitchId = vswitchId;
            return this;
        }
        public GetApplicationLoadBalancersResult build() {
            final var _resultValue = new GetApplicationLoadBalancersResult();
            _resultValue.address = address;
            _resultValue.addressIpVersion = addressIpVersion;
            _resultValue.addressType = addressType;
            _resultValue.balancers = balancers;
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.internetChargeType = internetChargeType;
            _resultValue.loadBalancerName = loadBalancerName;
            _resultValue.masterZoneId = masterZoneId;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.networkType = networkType;
            _resultValue.outputFile = outputFile;
            _resultValue.pageNumber = pageNumber;
            _resultValue.pageSize = pageSize;
            _resultValue.paymentType = paymentType;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.serverId = serverId;
            _resultValue.serverIntranetAddress = serverIntranetAddress;
            _resultValue.slaveZoneId = slaveZoneId;
            _resultValue.slbs = slbs;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.totalCount = totalCount;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}
