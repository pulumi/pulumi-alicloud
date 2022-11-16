// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlidnsDomainsDomainRecordLine {
    /**
     * @return The code of the parent line, or empty if there is none.
     * 
     */
    private final String fatherCode;
    /**
     * @return Sub-line Code.
     * 
     */
    private final String lineCode;
    /**
     * @return Parent line display name.
     * 
     */
    private final String lineDisplayName;
    /**
     * @return Sub-line display name.
     * 
     */
    private final String lineName;

    @CustomType.Constructor
    private GetAlidnsDomainsDomainRecordLine(
        @CustomType.Parameter("fatherCode") String fatherCode,
        @CustomType.Parameter("lineCode") String lineCode,
        @CustomType.Parameter("lineDisplayName") String lineDisplayName,
        @CustomType.Parameter("lineName") String lineName) {
        this.fatherCode = fatherCode;
        this.lineCode = lineCode;
        this.lineDisplayName = lineDisplayName;
        this.lineName = lineName;
    }

    /**
     * @return The code of the parent line, or empty if there is none.
     * 
     */
    public String fatherCode() {
        return this.fatherCode;
    }
    /**
     * @return Sub-line Code.
     * 
     */
    public String lineCode() {
        return this.lineCode;
    }
    /**
     * @return Parent line display name.
     * 
     */
    public String lineDisplayName() {
        return this.lineDisplayName;
    }
    /**
     * @return Sub-line display name.
     * 
     */
    public String lineName() {
        return this.lineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlidnsDomainsDomainRecordLine defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fatherCode;
        private String lineCode;
        private String lineDisplayName;
        private String lineName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlidnsDomainsDomainRecordLine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fatherCode = defaults.fatherCode;
    	      this.lineCode = defaults.lineCode;
    	      this.lineDisplayName = defaults.lineDisplayName;
    	      this.lineName = defaults.lineName;
        }

        public Builder fatherCode(String fatherCode) {
            this.fatherCode = Objects.requireNonNull(fatherCode);
            return this;
        }
        public Builder lineCode(String lineCode) {
            this.lineCode = Objects.requireNonNull(lineCode);
            return this;
        }
        public Builder lineDisplayName(String lineDisplayName) {
            this.lineDisplayName = Objects.requireNonNull(lineDisplayName);
            return this;
        }
        public Builder lineName(String lineName) {
            this.lineName = Objects.requireNonNull(lineName);
            return this;
        }        public GetAlidnsDomainsDomainRecordLine build() {
            return new GetAlidnsDomainsDomainRecordLine(fatherCode, lineCode, lineDisplayName, lineName);
        }
    }
}