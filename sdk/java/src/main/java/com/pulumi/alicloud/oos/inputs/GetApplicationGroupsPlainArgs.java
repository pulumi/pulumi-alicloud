// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationGroupsPlainArgs Empty = new GetApplicationGroupsPlainArgs();

    /**
     * The name of the Application.
     * 
     */
    @Import(name="applicationName", required=true)
    private String applicationName;

    /**
     * @return The name of the Application.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }

    /**
     * The region ID of the deployment.
     * 
     */
    @Import(name="deployRegionId")
    private @Nullable String deployRegionId;

    /**
     * @return The region ID of the deployment.
     * 
     */
    public Optional<String> deployRegionId() {
        return Optional.ofNullable(this.deployRegionId);
    }

    /**
     * A list of Application Group IDs. Its element value is same as Application Group Name.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Application Group IDs. Its element value is same as Application Group Name.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Application Group name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Application Group name.
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

    private GetApplicationGroupsPlainArgs() {}

    private GetApplicationGroupsPlainArgs(GetApplicationGroupsPlainArgs $) {
        this.applicationName = $.applicationName;
        this.deployRegionId = $.deployRegionId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationGroupsPlainArgs $;

        public Builder() {
            $ = new GetApplicationGroupsPlainArgs();
        }

        public Builder(GetApplicationGroupsPlainArgs defaults) {
            $ = new GetApplicationGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationName The name of the Application.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param deployRegionId The region ID of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deployRegionId(@Nullable String deployRegionId) {
            $.deployRegionId = deployRegionId;
            return this;
        }

        /**
         * @param ids A list of Application Group IDs. Its element value is same as Application Group Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Application Group IDs. Its element value is same as Application Group Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Application Group name.
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

        public GetApplicationGroupsPlainArgs build() {
            if ($.applicationName == null) {
                throw new MissingRequiredPropertyException("GetApplicationGroupsPlainArgs", "applicationName");
            }
            return $;
        }
    }

}