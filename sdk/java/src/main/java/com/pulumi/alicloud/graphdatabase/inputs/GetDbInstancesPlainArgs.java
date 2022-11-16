// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.graphdatabase.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbInstancesPlainArgs Empty = new GetDbInstancesPlainArgs();

    /**
     * According to the practical example or notes.
     * 
     */
    @Import(name="dbInstanceDescription")
    private @Nullable String dbInstanceDescription;

    /**
     * @return According to the practical example or notes.
     * 
     */
    public Optional<String> dbInstanceDescription() {
        return Optional.ofNullable(this.dbInstanceDescription);
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
     * A list of Db Instance IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Db Instance IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetDbInstancesPlainArgs() {}

    private GetDbInstancesPlainArgs(GetDbInstancesPlainArgs $) {
        this.dbInstanceDescription = $.dbInstanceDescription;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbInstancesPlainArgs $;

        public Builder() {
            $ = new GetDbInstancesPlainArgs();
        }

        public Builder(GetDbInstancesPlainArgs defaults) {
            $ = new GetDbInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbInstanceDescription According to the practical example or notes.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceDescription(@Nullable String dbInstanceDescription) {
            $.dbInstanceDescription = dbInstanceDescription;
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
         * @param ids A list of Db Instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Db Instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetDbInstancesPlainArgs build() {
            return $;
        }
    }

}