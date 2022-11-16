// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnatEntriesEntry {
    /**
     * @return The ID of the Snat Entry.
     * 
     */
    private final String id;
    /**
     * @return The ID of snat entry.
     * 
     */
    private final String snatEntryId;
    /**
     * @return The name of snat entry.
     * 
     */
    private final String snatEntryName;
    /**
     * @return The public IP of the Snat Entry.
     * 
     */
    private final String snatIp;
    /**
     * @return The source CIDR block of the Snat Entry.
     * 
     */
    private final String sourceCidr;
    /**
     * @return The source vswitch ID.
     * 
     */
    private final String sourceVswitchId;
    /**
     * @return The status of the Snat Entry. Valid values: `Available`, `Deleting` and `Pending`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetSnatEntriesEntry(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("snatEntryId") String snatEntryId,
        @CustomType.Parameter("snatEntryName") String snatEntryName,
        @CustomType.Parameter("snatIp") String snatIp,
        @CustomType.Parameter("sourceCidr") String sourceCidr,
        @CustomType.Parameter("sourceVswitchId") String sourceVswitchId,
        @CustomType.Parameter("status") String status) {
        this.id = id;
        this.snatEntryId = snatEntryId;
        this.snatEntryName = snatEntryName;
        this.snatIp = snatIp;
        this.sourceCidr = sourceCidr;
        this.sourceVswitchId = sourceVswitchId;
        this.status = status;
    }

    /**
     * @return The ID of the Snat Entry.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of snat entry.
     * 
     */
    public String snatEntryId() {
        return this.snatEntryId;
    }
    /**
     * @return The name of snat entry.
     * 
     */
    public String snatEntryName() {
        return this.snatEntryName;
    }
    /**
     * @return The public IP of the Snat Entry.
     * 
     */
    public String snatIp() {
        return this.snatIp;
    }
    /**
     * @return The source CIDR block of the Snat Entry.
     * 
     */
    public String sourceCidr() {
        return this.sourceCidr;
    }
    /**
     * @return The source vswitch ID.
     * 
     */
    public String sourceVswitchId() {
        return this.sourceVswitchId;
    }
    /**
     * @return The status of the Snat Entry. Valid values: `Available`, `Deleting` and `Pending`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnatEntriesEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String snatEntryId;
        private String snatEntryName;
        private String snatIp;
        private String sourceCidr;
        private String sourceVswitchId;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnatEntriesEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.snatEntryId = defaults.snatEntryId;
    	      this.snatEntryName = defaults.snatEntryName;
    	      this.snatIp = defaults.snatIp;
    	      this.sourceCidr = defaults.sourceCidr;
    	      this.sourceVswitchId = defaults.sourceVswitchId;
    	      this.status = defaults.status;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder snatEntryId(String snatEntryId) {
            this.snatEntryId = Objects.requireNonNull(snatEntryId);
            return this;
        }
        public Builder snatEntryName(String snatEntryName) {
            this.snatEntryName = Objects.requireNonNull(snatEntryName);
            return this;
        }
        public Builder snatIp(String snatIp) {
            this.snatIp = Objects.requireNonNull(snatIp);
            return this;
        }
        public Builder sourceCidr(String sourceCidr) {
            this.sourceCidr = Objects.requireNonNull(sourceCidr);
            return this;
        }
        public Builder sourceVswitchId(String sourceVswitchId) {
            this.sourceVswitchId = Objects.requireNonNull(sourceVswitchId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetSnatEntriesEntry build() {
            return new GetSnatEntriesEntry(id, snatEntryId, snatEntryName, snatIp, sourceCidr, sourceVswitchId, status);
        }
    }
}