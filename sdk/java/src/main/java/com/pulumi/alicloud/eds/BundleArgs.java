// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BundleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BundleArgs Empty = new BundleArgs();

    /**
     * The name of the bundle.
     * 
     */
    @Import(name="bundleName")
    private @Nullable Output<String> bundleName;

    /**
     * @return The name of the bundle.
     * 
     */
    public Optional<Output<String>> bundleName() {
        return Optional.ofNullable(this.bundleName);
    }

    /**
     * The description of the bundle.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the bundle.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The desktop type. You can call `alicloud.eds.getDesktopTypes` to query desktop type.
     * 
     */
    @Import(name="desktopType", required=true)
    private Output<String> desktopType;

    /**
     * @return The desktop type. You can call `alicloud.eds.getDesktopTypes` to query desktop type.
     * 
     */
    public Output<String> desktopType() {
        return this.desktopType;
    }

    /**
     * The ID of the image.
     * 
     */
    @Import(name="imageId", required=true)
    private Output<String> imageId;

    /**
     * @return The ID of the image.
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
    }

    /**
     * The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
     * 
     */
    @Import(name="language")
    private @Nullable Output<String> language;

    /**
     * @return The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
     * 
     */
    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    /**
     * The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     * 
     */
    @Import(name="rootDiskPerformanceLevel")
    private @Nullable Output<String> rootDiskPerformanceLevel;

    /**
     * @return The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     * 
     */
    public Optional<Output<String>> rootDiskPerformanceLevel() {
        return Optional.ofNullable(this.rootDiskPerformanceLevel);
    }

    /**
     * The root disk size gib.
     * 
     */
    @Import(name="rootDiskSizeGib", required=true)
    private Output<Integer> rootDiskSizeGib;

    /**
     * @return The root disk size gib.
     * 
     */
    public Output<Integer> rootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    /**
     * The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     * 
     */
    @Import(name="userDiskPerformanceLevel")
    private @Nullable Output<String> userDiskPerformanceLevel;

    /**
     * @return The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
     * 
     */
    public Optional<Output<String>> userDiskPerformanceLevel() {
        return Optional.ofNullable(this.userDiskPerformanceLevel);
    }

    /**
     * The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
     * - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
     * - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
     * 
     */
    @Import(name="userDiskSizeGibs", required=true)
    private Output<List<Integer>> userDiskSizeGibs;

    /**
     * @return The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
     * - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
     * - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
     * 
     */
    public Output<List<Integer>> userDiskSizeGibs() {
        return this.userDiskSizeGibs;
    }

    private BundleArgs() {}

    private BundleArgs(BundleArgs $) {
        this.bundleName = $.bundleName;
        this.description = $.description;
        this.desktopType = $.desktopType;
        this.imageId = $.imageId;
        this.language = $.language;
        this.rootDiskPerformanceLevel = $.rootDiskPerformanceLevel;
        this.rootDiskSizeGib = $.rootDiskSizeGib;
        this.userDiskPerformanceLevel = $.userDiskPerformanceLevel;
        this.userDiskSizeGibs = $.userDiskSizeGibs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BundleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BundleArgs $;

        public Builder() {
            $ = new BundleArgs();
        }

        public Builder(BundleArgs defaults) {
            $ = new BundleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bundleName The name of the bundle.
         * 
         * @return builder
         * 
         */
        public Builder bundleName(@Nullable Output<String> bundleName) {
            $.bundleName = bundleName;
            return this;
        }

        /**
         * @param bundleName The name of the bundle.
         * 
         * @return builder
         * 
         */
        public Builder bundleName(String bundleName) {
            return bundleName(Output.of(bundleName));
        }

        /**
         * @param description The description of the bundle.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the bundle.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param desktopType The desktop type. You can call `alicloud.eds.getDesktopTypes` to query desktop type.
         * 
         * @return builder
         * 
         */
        public Builder desktopType(Output<String> desktopType) {
            $.desktopType = desktopType;
            return this;
        }

        /**
         * @param desktopType The desktop type. You can call `alicloud.eds.getDesktopTypes` to query desktop type.
         * 
         * @return builder
         * 
         */
        public Builder desktopType(String desktopType) {
            return desktopType(Output.of(desktopType));
        }

        /**
         * @param imageId The ID of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The ID of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param language The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language The language. Valid values: `zh-CN`, `zh-HK`, `en-US`, `ja-JP`.
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            return language(Output.of(language));
        }

        /**
         * @param rootDiskPerformanceLevel The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskPerformanceLevel(@Nullable Output<String> rootDiskPerformanceLevel) {
            $.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
            return this;
        }

        /**
         * @param rootDiskPerformanceLevel The root disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
            return rootDiskPerformanceLevel(Output.of(rootDiskPerformanceLevel));
        }

        /**
         * @param rootDiskSizeGib The root disk size gib.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskSizeGib(Output<Integer> rootDiskSizeGib) {
            $.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }

        /**
         * @param rootDiskSizeGib The root disk size gib.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
            return rootDiskSizeGib(Output.of(rootDiskSizeGib));
        }

        /**
         * @param userDiskPerformanceLevel The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
         * 
         * @return builder
         * 
         */
        public Builder userDiskPerformanceLevel(@Nullable Output<String> userDiskPerformanceLevel) {
            $.userDiskPerformanceLevel = userDiskPerformanceLevel;
            return this;
        }

        /**
         * @param userDiskPerformanceLevel The user disk performance level. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
         * 
         * @return builder
         * 
         */
        public Builder userDiskPerformanceLevel(String userDiskPerformanceLevel) {
            return userDiskPerformanceLevel(Output.of(userDiskPerformanceLevel));
        }

        /**
         * @param userDiskSizeGibs The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
         * - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
         * - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
         * 
         * @return builder
         * 
         */
        public Builder userDiskSizeGibs(Output<List<Integer>> userDiskSizeGibs) {
            $.userDiskSizeGibs = userDiskSizeGibs;
            return this;
        }

        /**
         * @param userDiskSizeGibs The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
         * - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
         * - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
         * 
         * @return builder
         * 
         */
        public Builder userDiskSizeGibs(List<Integer> userDiskSizeGibs) {
            return userDiskSizeGibs(Output.of(userDiskSizeGibs));
        }

        /**
         * @param userDiskSizeGibs The size of the data disk. Currently, only one data disk can be set. Unit: GiB.
         * - The size of the data disk that supports the setting corresponds to the specification. For more information, see [Overview of Desktop Specifications](https://help.aliyun.com/document_detail/188609.htm?spm=a2c4g.11186623.0.0.6406297bE0U5DG).
         * - The data disk size (user_disk_size_gib) set in the template must be greater than the data disk size (data_disk_size) in the mirror.
         * 
         * @return builder
         * 
         */
        public Builder userDiskSizeGibs(Integer... userDiskSizeGibs) {
            return userDiskSizeGibs(List.of(userDiskSizeGibs));
        }

        public BundleArgs build() {
            if ($.desktopType == null) {
                throw new MissingRequiredPropertyException("BundleArgs", "desktopType");
            }
            if ($.imageId == null) {
                throw new MissingRequiredPropertyException("BundleArgs", "imageId");
            }
            if ($.rootDiskSizeGib == null) {
                throw new MissingRequiredPropertyException("BundleArgs", "rootDiskSizeGib");
            }
            if ($.userDiskSizeGibs == null) {
                throw new MissingRequiredPropertyException("BundleArgs", "userDiskSizeGibs");
            }
            return $;
        }
    }

}
