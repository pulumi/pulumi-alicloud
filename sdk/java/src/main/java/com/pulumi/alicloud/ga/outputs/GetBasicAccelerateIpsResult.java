// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.alicloud.ga.outputs.GetBasicAccelerateIpsIp;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBasicAccelerateIpsResult {
    /**
     * @return The address of the Basic Accelerate IP.
     * 
     */
    private @Nullable String accelerateIpAddress;
    /**
     * @return The id of the Basic Accelerate IP.
     * 
     */
    private @Nullable String accelerateIpId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    /**
     * @return The ID of the Basic Ip Set.
     * 
     */
    private String ipSetId;
    /**
     * @return A list of Global Accelerator Basic Accelerate IPs. Each element contains the following attributes:
     * 
     */
    private List<GetBasicAccelerateIpsIp> ips;
    private @Nullable String outputFile;
    /**
     * @return The status of the Basic Accelerate IP instance.
     * 
     */
    private @Nullable String status;

    private GetBasicAccelerateIpsResult() {}
    /**
     * @return The address of the Basic Accelerate IP.
     * 
     */
    public Optional<String> accelerateIpAddress() {
        return Optional.ofNullable(this.accelerateIpAddress);
    }
    /**
     * @return The id of the Basic Accelerate IP.
     * 
     */
    public Optional<String> accelerateIpId() {
        return Optional.ofNullable(this.accelerateIpId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return The ID of the Basic Ip Set.
     * 
     */
    public String ipSetId() {
        return this.ipSetId;
    }
    /**
     * @return A list of Global Accelerator Basic Accelerate IPs. Each element contains the following attributes:
     * 
     */
    public List<GetBasicAccelerateIpsIp> ips() {
        return this.ips;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The status of the Basic Accelerate IP instance.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBasicAccelerateIpsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accelerateIpAddress;
        private @Nullable String accelerateIpId;
        private String id;
        private List<String> ids;
        private String ipSetId;
        private List<GetBasicAccelerateIpsIp> ips;
        private @Nullable String outputFile;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetBasicAccelerateIpsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerateIpAddress = defaults.accelerateIpAddress;
    	      this.accelerateIpId = defaults.accelerateIpId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.ipSetId = defaults.ipSetId;
    	      this.ips = defaults.ips;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder accelerateIpAddress(@Nullable String accelerateIpAddress) {

            this.accelerateIpAddress = accelerateIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder accelerateIpId(@Nullable String accelerateIpId) {

            this.accelerateIpId = accelerateIpId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBasicAccelerateIpsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetBasicAccelerateIpsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder ipSetId(String ipSetId) {
            if (ipSetId == null) {
              throw new MissingRequiredPropertyException("GetBasicAccelerateIpsResult", "ipSetId");
            }
            this.ipSetId = ipSetId;
            return this;
        }
        @CustomType.Setter
        public Builder ips(List<GetBasicAccelerateIpsIp> ips) {
            if (ips == null) {
              throw new MissingRequiredPropertyException("GetBasicAccelerateIpsResult", "ips");
            }
            this.ips = ips;
            return this;
        }
        public Builder ips(GetBasicAccelerateIpsIp... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetBasicAccelerateIpsResult build() {
            final var _resultValue = new GetBasicAccelerateIpsResult();
            _resultValue.accelerateIpAddress = accelerateIpAddress;
            _resultValue.accelerateIpId = accelerateIpId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.ipSetId = ipSetId;
            _resultValue.ips = ips;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
