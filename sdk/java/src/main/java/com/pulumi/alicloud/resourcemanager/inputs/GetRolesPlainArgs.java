// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRolesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRolesPlainArgs Empty = new GetRolesPlainArgs();

    /**
     * Default to `false`. Set it to true can output more details.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to true can output more details.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Resource Manager Role IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Resource Manager Role IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by role name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by role name.
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

    private GetRolesPlainArgs() {}

    private GetRolesPlainArgs(GetRolesPlainArgs $) {
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRolesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRolesPlainArgs $;

        public Builder() {
            $ = new GetRolesPlainArgs();
        }

        public Builder(GetRolesPlainArgs defaults) {
            $ = new GetRolesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableDetails Default to `false`. Set it to true can output more details.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Resource Manager Role IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Resource Manager Role IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by role name.
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

        public GetRolesPlainArgs build() {
            return $;
        }
    }

}
