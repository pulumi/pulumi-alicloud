// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceEnginesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceEnginesPlainArgs Empty = new GetInstanceEnginesPlainArgs();

    /**
     * DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
     * 
     */
    @Import(name="category")
    private @Nullable String category;

    /**
     * @return DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * The DB instance storage space required by the user. Valid values: &#34;cloud_ssd&#34;, &#34;local_ssd&#34;, &#34;cloud_essd&#34;, &#34;cloud_essd2&#34;, &#34;cloud_essd3&#34;.
     * 
     */
    @Import(name="dbInstanceStorageType")
    private @Nullable String dbInstanceStorageType;

    /**
     * @return The DB instance storage space required by the user. Valid values: &#34;cloud_ssd&#34;, &#34;local_ssd&#34;, &#34;cloud_essd&#34;, &#34;cloud_essd2&#34;, &#34;cloud_essd3&#34;.
     * 
     */
    public Optional<String> dbInstanceStorageType() {
        return Optional.ofNullable(this.dbInstanceStorageType);
    }

    /**
     * Database type. Valid values: &#34;MySQL&#34;, &#34;SQLServer&#34;, &#34;PostgreSQL&#34;, &#34;MariaDB&#34;. If not set, it will match all of engines.
     * 
     */
    @Import(name="engine")
    private @Nullable String engine;

    /**
     * @return Database type. Valid values: &#34;MySQL&#34;, &#34;SQLServer&#34;, &#34;PostgreSQL&#34;, &#34;MariaDB&#34;. If not set, it will match all of engines.
     * 
     */
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable String engineVersion;

    /**
     * @return Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
     * 
     */
    public Optional<String> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     * 
     */
    @Import(name="instanceChargeType")
    private @Nullable String instanceChargeType;

    /**
     * @return Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     * 
     */
    public Optional<String> instanceChargeType() {
        return Optional.ofNullable(this.instanceChargeType);
    }

    /**
     * Whether to show multi available zone. Default false to not show multi availability zone.
     * 
     */
    @Import(name="multiZone")
    private @Nullable Boolean multiZone;

    /**
     * @return Whether to show multi available zone. Default false to not show multi availability zone.
     * 
     */
    public Optional<Boolean> multiZone() {
        return Optional.ofNullable(this.multiZone);
    }

    /**
     * File name where to save data source results (after running `pulumi up`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi up`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The Zone to launch the DB instance.
     * 
     */
    @Import(name="zoneId")
    private @Nullable String zoneId;

    /**
     * @return The Zone to launch the DB instance.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetInstanceEnginesPlainArgs() {}

    private GetInstanceEnginesPlainArgs(GetInstanceEnginesPlainArgs $) {
        this.category = $.category;
        this.dbInstanceStorageType = $.dbInstanceStorageType;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.instanceChargeType = $.instanceChargeType;
        this.multiZone = $.multiZone;
        this.outputFile = $.outputFile;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceEnginesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceEnginesPlainArgs $;

        public Builder() {
            $ = new GetInstanceEnginesPlainArgs();
        }

        public Builder(GetInstanceEnginesPlainArgs defaults) {
            $ = new GetInstanceEnginesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable String category) {
            $.category = category;
            return this;
        }

        /**
         * @param dbInstanceStorageType The DB instance storage space required by the user. Valid values: &#34;cloud_ssd&#34;, &#34;local_ssd&#34;, &#34;cloud_essd&#34;, &#34;cloud_essd2&#34;, &#34;cloud_essd3&#34;.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceStorageType(@Nullable String dbInstanceStorageType) {
            $.dbInstanceStorageType = dbInstanceStorageType;
            return this;
        }

        /**
         * @param engine Database type. Valid values: &#34;MySQL&#34;, &#34;SQLServer&#34;, &#34;PostgreSQL&#34;, &#34;MariaDB&#34;. If not set, it will match all of engines.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable String engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engineVersion Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable String engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param instanceChargeType Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
         * 
         * @return builder
         * 
         */
        public Builder instanceChargeType(@Nullable String instanceChargeType) {
            $.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * @param multiZone Whether to show multi available zone. Default false to not show multi availability zone.
         * 
         * @return builder
         * 
         */
        public Builder multiZone(@Nullable Boolean multiZone) {
            $.multiZone = multiZone;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi up`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param zoneId The Zone to launch the DB instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetInstanceEnginesPlainArgs build() {
            return $;
        }
    }

}
