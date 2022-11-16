// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResolutionLinesLine {
    private final String lineCode;
    /**
     * @return Line display name.
     * 
     */
    private final String lineDisplayName;
    /**
     * @return Line name.
     * 
     */
    private final String lineName;

    @CustomType.Constructor
    private GetResolutionLinesLine(
        @CustomType.Parameter("lineCode") String lineCode,
        @CustomType.Parameter("lineDisplayName") String lineDisplayName,
        @CustomType.Parameter("lineName") String lineName) {
        this.lineCode = lineCode;
        this.lineDisplayName = lineDisplayName;
        this.lineName = lineName;
    }

    public String lineCode() {
        return this.lineCode;
    }
    /**
     * @return Line display name.
     * 
     */
    public String lineDisplayName() {
        return this.lineDisplayName;
    }
    /**
     * @return Line name.
     * 
     */
    public String lineName() {
        return this.lineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolutionLinesLine defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lineCode;
        private String lineDisplayName;
        private String lineName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolutionLinesLine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lineCode = defaults.lineCode;
    	      this.lineDisplayName = defaults.lineDisplayName;
    	      this.lineName = defaults.lineName;
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
        }        public GetResolutionLinesLine build() {
            return new GetResolutionLinesLine(lineCode, lineDisplayName, lineName);
        }
    }
}