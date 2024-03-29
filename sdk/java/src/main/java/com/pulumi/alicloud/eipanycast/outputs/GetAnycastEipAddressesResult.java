// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eipanycast.outputs;

import com.pulumi.alicloud.eipanycast.outputs.GetAnycastEipAddressesAddress;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAnycastEipAddressesResult {
    private List<GetAnycastEipAddressesAddress> addresses;
    private @Nullable String anycastEipAddressName;
    private @Nullable List<String> bindInstanceIds;
    private @Nullable String businessStatus;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String internetChargeType;
    private @Nullable String ipAddress;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String paymentType;
    private @Nullable String serviceLocation;
    private @Nullable String status;

    private GetAnycastEipAddressesResult() {}
    public List<GetAnycastEipAddressesAddress> addresses() {
        return this.addresses;
    }
    public Optional<String> anycastEipAddressName() {
        return Optional.ofNullable(this.anycastEipAddressName);
    }
    public List<String> bindInstanceIds() {
        return this.bindInstanceIds == null ? List.of() : this.bindInstanceIds;
    }
    public Optional<String> businessStatus() {
        return Optional.ofNullable(this.businessStatus);
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
    public Optional<String> internetChargeType() {
        return Optional.ofNullable(this.internetChargeType);
    }
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }
    public Optional<String> serviceLocation() {
        return Optional.ofNullable(this.serviceLocation);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnycastEipAddressesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAnycastEipAddressesAddress> addresses;
        private @Nullable String anycastEipAddressName;
        private @Nullable List<String> bindInstanceIds;
        private @Nullable String businessStatus;
        private String id;
        private List<String> ids;
        private @Nullable String internetChargeType;
        private @Nullable String ipAddress;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String paymentType;
        private @Nullable String serviceLocation;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetAnycastEipAddressesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.anycastEipAddressName = defaults.anycastEipAddressName;
    	      this.bindInstanceIds = defaults.bindInstanceIds;
    	      this.businessStatus = defaults.businessStatus;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.internetChargeType = defaults.internetChargeType;
    	      this.ipAddress = defaults.ipAddress;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.paymentType = defaults.paymentType;
    	      this.serviceLocation = defaults.serviceLocation;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder addresses(List<GetAnycastEipAddressesAddress> addresses) {
            if (addresses == null) {
              throw new MissingRequiredPropertyException("GetAnycastEipAddressesResult", "addresses");
            }
            this.addresses = addresses;
            return this;
        }
        public Builder addresses(GetAnycastEipAddressesAddress... addresses) {
            return addresses(List.of(addresses));
        }
        @CustomType.Setter
        public Builder anycastEipAddressName(@Nullable String anycastEipAddressName) {

            this.anycastEipAddressName = anycastEipAddressName;
            return this;
        }
        @CustomType.Setter
        public Builder bindInstanceIds(@Nullable List<String> bindInstanceIds) {

            this.bindInstanceIds = bindInstanceIds;
            return this;
        }
        public Builder bindInstanceIds(String... bindInstanceIds) {
            return bindInstanceIds(List.of(bindInstanceIds));
        }
        @CustomType.Setter
        public Builder businessStatus(@Nullable String businessStatus) {

            this.businessStatus = businessStatus;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAnycastEipAddressesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetAnycastEipAddressesResult", "ids");
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
        public Builder ipAddress(@Nullable String ipAddress) {

            this.ipAddress = ipAddress;
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
              throw new MissingRequiredPropertyException("GetAnycastEipAddressesResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(@Nullable String paymentType) {

            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder serviceLocation(@Nullable String serviceLocation) {

            this.serviceLocation = serviceLocation;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetAnycastEipAddressesResult build() {
            final var _resultValue = new GetAnycastEipAddressesResult();
            _resultValue.addresses = addresses;
            _resultValue.anycastEipAddressName = anycastEipAddressName;
            _resultValue.bindInstanceIds = bindInstanceIds;
            _resultValue.businessStatus = businessStatus;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.internetChargeType = internetChargeType;
            _resultValue.ipAddress = ipAddress;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.paymentType = paymentType;
            _resultValue.serviceLocation = serviceLocation;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
