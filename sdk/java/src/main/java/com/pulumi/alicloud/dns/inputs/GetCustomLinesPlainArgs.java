// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCustomLinesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomLinesPlainArgs Empty = new GetCustomLinesPlainArgs();

    /**
     * The Domain name.
     * 
     */
    @Import(name="domainName", required=true)
    private String domainName;

    /**
     * @return The Domain name.
     * 
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Custom Line IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Custom Line IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The lang.
     * 
     */
    @Import(name="lang")
    private @Nullable String lang;

    /**
     * @return The lang.
     * 
     */
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * A regex string to filter results by Custom Line name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Custom Line name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetCustomLinesPlainArgs() {}

    private GetCustomLinesPlainArgs(GetCustomLinesPlainArgs $) {
        this.domainName = $.domainName;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.lang = $.lang;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomLinesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomLinesPlainArgs $;

        public Builder() {
            $ = new GetCustomLinesPlainArgs();
        }

        public Builder(GetCustomLinesPlainArgs defaults) {
            $ = new GetCustomLinesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The Domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Custom Line IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Custom Line IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param lang The lang.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable String lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Custom Line name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetCustomLinesPlainArgs build() {
            if ($.domainName == null) {
                throw new MissingRequiredPropertyException("GetCustomLinesPlainArgs", "domainName");
            }
            return $;
        }
    }

}
