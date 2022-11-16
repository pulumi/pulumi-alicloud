// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eipanycast.outputs;

import com.pulumi.alicloud.eipanycast.outputs.GetAnycastEipAddressesAddressAnycastEipBindInfoList;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAnycastEipAddressesAddress {
    /**
     * @return Anycast EIP instance account ID.
     * 
     */
    private final Integer aliUid;
    /**
     * @return Anycast EIP instance name.
     * 
     */
    private final String anycastEipAddressName;
    /**
     * @return AnycastEip binding information.
     * 
     */
    private final List<GetAnycastEipAddressesAddressAnycastEipBindInfoList> anycastEipBindInfoLists;
    /**
     * @return Anycast EIP instance ID.
     * 
     */
    private final String anycastId;
    /**
     * @return The peak bandwidth of the Anycast EIP instance, in Mbps.
     * 
     */
    private final Integer bandwidth;
    /**
     * @return Anycast EIP instance account BID.
     * 
     */
    private final String bid;
    /**
     * @return The business status of the Anycast EIP instance. -`Normal`: Normal state. -`FinancialLocked`: The status of arrears locked.
     * 
     */
    private final String businessStatus;
    /**
     * @return Anycast EIP instance description.
     * 
     */
    private final String description;
    /**
     * @return The ID of the Anycast Eip Address.
     * 
     */
    private final String id;
    /**
     * @return The billing method of Anycast EIP instance. `PayByBandwidth`: refers to the method of billing based on traffic.
     * 
     */
    private final String internetChargeType;
    /**
     * @return Anycast EIP instance IP address.
     * 
     */
    private final String ipAddress;
    /**
     * @return The payment model of Anycast EIP instance. &#34;PostPaid&#34;: Refers to the post-paid mode.
     * 
     */
    private final String paymentType;
    /**
     * @return Anycast EIP instance access area. &#34;international&#34;: Refers to areas outside of Mainland China.
     * 
     */
    private final String serviceLocation;
    /**
     * @return IP status。- `Associating`, `Unassociating`, `Allocated`, `Associated`, `Modifying`, `Releasing`, `Released`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetAnycastEipAddressesAddress(
        @CustomType.Parameter("aliUid") Integer aliUid,
        @CustomType.Parameter("anycastEipAddressName") String anycastEipAddressName,
        @CustomType.Parameter("anycastEipBindInfoLists") List<GetAnycastEipAddressesAddressAnycastEipBindInfoList> anycastEipBindInfoLists,
        @CustomType.Parameter("anycastId") String anycastId,
        @CustomType.Parameter("bandwidth") Integer bandwidth,
        @CustomType.Parameter("bid") String bid,
        @CustomType.Parameter("businessStatus") String businessStatus,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("internetChargeType") String internetChargeType,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("paymentType") String paymentType,
        @CustomType.Parameter("serviceLocation") String serviceLocation,
        @CustomType.Parameter("status") String status) {
        this.aliUid = aliUid;
        this.anycastEipAddressName = anycastEipAddressName;
        this.anycastEipBindInfoLists = anycastEipBindInfoLists;
        this.anycastId = anycastId;
        this.bandwidth = bandwidth;
        this.bid = bid;
        this.businessStatus = businessStatus;
        this.description = description;
        this.id = id;
        this.internetChargeType = internetChargeType;
        this.ipAddress = ipAddress;
        this.paymentType = paymentType;
        this.serviceLocation = serviceLocation;
        this.status = status;
    }

    /**
     * @return Anycast EIP instance account ID.
     * 
     */
    public Integer aliUid() {
        return this.aliUid;
    }
    /**
     * @return Anycast EIP instance name.
     * 
     */
    public String anycastEipAddressName() {
        return this.anycastEipAddressName;
    }
    /**
     * @return AnycastEip binding information.
     * 
     */
    public List<GetAnycastEipAddressesAddressAnycastEipBindInfoList> anycastEipBindInfoLists() {
        return this.anycastEipBindInfoLists;
    }
    /**
     * @return Anycast EIP instance ID.
     * 
     */
    public String anycastId() {
        return this.anycastId;
    }
    /**
     * @return The peak bandwidth of the Anycast EIP instance, in Mbps.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return Anycast EIP instance account BID.
     * 
     */
    public String bid() {
        return this.bid;
    }
    /**
     * @return The business status of the Anycast EIP instance. -`Normal`: Normal state. -`FinancialLocked`: The status of arrears locked.
     * 
     */
    public String businessStatus() {
        return this.businessStatus;
    }
    /**
     * @return Anycast EIP instance description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Anycast Eip Address.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The billing method of Anycast EIP instance. `PayByBandwidth`: refers to the method of billing based on traffic.
     * 
     */
    public String internetChargeType() {
        return this.internetChargeType;
    }
    /**
     * @return Anycast EIP instance IP address.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The payment model of Anycast EIP instance. &#34;PostPaid&#34;: Refers to the post-paid mode.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return Anycast EIP instance access area. &#34;international&#34;: Refers to areas outside of Mainland China.
     * 
     */
    public String serviceLocation() {
        return this.serviceLocation;
    }
    /**
     * @return IP status。- `Associating`, `Unassociating`, `Allocated`, `Associated`, `Modifying`, `Releasing`, `Released`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnycastEipAddressesAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer aliUid;
        private String anycastEipAddressName;
        private List<GetAnycastEipAddressesAddressAnycastEipBindInfoList> anycastEipBindInfoLists;
        private String anycastId;
        private Integer bandwidth;
        private String bid;
        private String businessStatus;
        private String description;
        private String id;
        private String internetChargeType;
        private String ipAddress;
        private String paymentType;
        private String serviceLocation;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnycastEipAddressesAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliUid = defaults.aliUid;
    	      this.anycastEipAddressName = defaults.anycastEipAddressName;
    	      this.anycastEipBindInfoLists = defaults.anycastEipBindInfoLists;
    	      this.anycastId = defaults.anycastId;
    	      this.bandwidth = defaults.bandwidth;
    	      this.bid = defaults.bid;
    	      this.businessStatus = defaults.businessStatus;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.internetChargeType = defaults.internetChargeType;
    	      this.ipAddress = defaults.ipAddress;
    	      this.paymentType = defaults.paymentType;
    	      this.serviceLocation = defaults.serviceLocation;
    	      this.status = defaults.status;
        }

        public Builder aliUid(Integer aliUid) {
            this.aliUid = Objects.requireNonNull(aliUid);
            return this;
        }
        public Builder anycastEipAddressName(String anycastEipAddressName) {
            this.anycastEipAddressName = Objects.requireNonNull(anycastEipAddressName);
            return this;
        }
        public Builder anycastEipBindInfoLists(List<GetAnycastEipAddressesAddressAnycastEipBindInfoList> anycastEipBindInfoLists) {
            this.anycastEipBindInfoLists = Objects.requireNonNull(anycastEipBindInfoLists);
            return this;
        }
        public Builder anycastEipBindInfoLists(GetAnycastEipAddressesAddressAnycastEipBindInfoList... anycastEipBindInfoLists) {
            return anycastEipBindInfoLists(List.of(anycastEipBindInfoLists));
        }
        public Builder anycastId(String anycastId) {
            this.anycastId = Objects.requireNonNull(anycastId);
            return this;
        }
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        public Builder bid(String bid) {
            this.bid = Objects.requireNonNull(bid);
            return this;
        }
        public Builder businessStatus(String businessStatus) {
            this.businessStatus = Objects.requireNonNull(businessStatus);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = Objects.requireNonNull(internetChargeType);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder paymentType(String paymentType) {
            this.paymentType = Objects.requireNonNull(paymentType);
            return this;
        }
        public Builder serviceLocation(String serviceLocation) {
            this.serviceLocation = Objects.requireNonNull(serviceLocation);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetAnycastEipAddressesAddress build() {
            return new GetAnycastEipAddressesAddress(aliUid, anycastEipAddressName, anycastEipBindInfoLists, anycastId, bandwidth, bid, businessStatus, description, id, internetChargeType, ipAddress, paymentType, serviceLocation, status);
        }
    }
}