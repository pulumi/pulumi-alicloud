# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['VideoProcessingArgs', 'VideoProcessing']

@pulumi.input_type
class VideoProcessingArgs:
    def __init__(__self__, *,
                 site_id: pulumi.Input[_builtins.int],
                 flv_seek_end: Optional[pulumi.Input[_builtins.str]] = None,
                 flv_seek_start: Optional[pulumi.Input[_builtins.str]] = None,
                 flv_video_seek_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 mp4_seek_end: Optional[pulumi.Input[_builtins.str]] = None,
                 mp4_seek_start: Optional[pulumi.Input[_builtins.str]] = None,
                 rule: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_enable: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_name: Optional[pulumi.Input[_builtins.str]] = None,
                 sequence: Optional[pulumi.Input[_builtins.int]] = None,
                 site_version: Optional[pulumi.Input[_builtins.int]] = None,
                 video_seek_enable: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a VideoProcessing resource.
        :param pulumi.Input[_builtins.int] site_id: The site ID, which can be obtained by calling the ListSites API.
        :param pulumi.Input[_builtins.str] flv_seek_end: Custom FLV end parameters.
        :param pulumi.Input[_builtins.str] flv_seek_start: Custom FLV start parameters.
        :param pulumi.Input[_builtins.str] flv_video_seek_mode: FLV drag mode. Value range:
        :param pulumi.Input[_builtins.str] mp4_seek_end: Custom mp4 end parameters.
        :param pulumi.Input[_builtins.str] mp4_seek_start: Custom mp4 start parameters.
        :param pulumi.Input[_builtins.str] rule: Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
               - Match all incoming requests: value set to true
               - Match specified request: Set the value to a custom expression, for example: (http.host eq \\"video.example.com\\")
        :param pulumi.Input[_builtins.str] rule_enable: Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
        :param pulumi.Input[_builtins.str] rule_name: Rule name. When adding global configuration, this parameter does not need to be set.
        :param pulumi.Input[_builtins.int] sequence: Order of rule execution. The smaller the value, the higher the priority for execution.
        :param pulumi.Input[_builtins.int] site_version: The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        :param pulumi.Input[_builtins.str] video_seek_enable: Drag and drop the play function switch. Value range:
        """
        pulumi.set(__self__, "site_id", site_id)
        if flv_seek_end is not None:
            pulumi.set(__self__, "flv_seek_end", flv_seek_end)
        if flv_seek_start is not None:
            pulumi.set(__self__, "flv_seek_start", flv_seek_start)
        if flv_video_seek_mode is not None:
            pulumi.set(__self__, "flv_video_seek_mode", flv_video_seek_mode)
        if mp4_seek_end is not None:
            pulumi.set(__self__, "mp4_seek_end", mp4_seek_end)
        if mp4_seek_start is not None:
            pulumi.set(__self__, "mp4_seek_start", mp4_seek_start)
        if rule is not None:
            pulumi.set(__self__, "rule", rule)
        if rule_enable is not None:
            pulumi.set(__self__, "rule_enable", rule_enable)
        if rule_name is not None:
            pulumi.set(__self__, "rule_name", rule_name)
        if sequence is not None:
            pulumi.set(__self__, "sequence", sequence)
        if site_version is not None:
            pulumi.set(__self__, "site_version", site_version)
        if video_seek_enable is not None:
            pulumi.set(__self__, "video_seek_enable", video_seek_enable)

    @_builtins.property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Input[_builtins.int]:
        """
        The site ID, which can be obtained by calling the ListSites API.
        """
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "site_id", value)

    @_builtins.property
    @pulumi.getter(name="flvSeekEnd")
    def flv_seek_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Custom FLV end parameters.
        """
        return pulumi.get(self, "flv_seek_end")

    @flv_seek_end.setter
    def flv_seek_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "flv_seek_end", value)

    @_builtins.property
    @pulumi.getter(name="flvSeekStart")
    def flv_seek_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Custom FLV start parameters.
        """
        return pulumi.get(self, "flv_seek_start")

    @flv_seek_start.setter
    def flv_seek_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "flv_seek_start", value)

    @_builtins.property
    @pulumi.getter(name="flvVideoSeekMode")
    def flv_video_seek_mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        FLV drag mode. Value range:
        """
        return pulumi.get(self, "flv_video_seek_mode")

    @flv_video_seek_mode.setter
    def flv_video_seek_mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "flv_video_seek_mode", value)

    @_builtins.property
    @pulumi.getter(name="mp4SeekEnd")
    def mp4_seek_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Custom mp4 end parameters.
        """
        return pulumi.get(self, "mp4_seek_end")

    @mp4_seek_end.setter
    def mp4_seek_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mp4_seek_end", value)

    @_builtins.property
    @pulumi.getter(name="mp4SeekStart")
    def mp4_seek_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Custom mp4 start parameters.
        """
        return pulumi.get(self, "mp4_seek_start")

    @mp4_seek_start.setter
    def mp4_seek_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mp4_seek_start", value)

    @_builtins.property
    @pulumi.getter
    def rule(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
        - Match all incoming requests: value set to true
        - Match specified request: Set the value to a custom expression, for example: (http.host eq \\"video.example.com\\")
        """
        return pulumi.get(self, "rule")

    @rule.setter
    def rule(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule", value)

    @_builtins.property
    @pulumi.getter(name="ruleEnable")
    def rule_enable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
        """
        return pulumi.get(self, "rule_enable")

    @rule_enable.setter
    def rule_enable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule_enable", value)

    @_builtins.property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule name. When adding global configuration, this parameter does not need to be set.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule_name", value)

    @_builtins.property
    @pulumi.getter
    def sequence(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Order of rule execution. The smaller the value, the higher the priority for execution.
        """
        return pulumi.get(self, "sequence")

    @sequence.setter
    def sequence(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "sequence", value)

    @_builtins.property
    @pulumi.getter(name="siteVersion")
    def site_version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        """
        return pulumi.get(self, "site_version")

    @site_version.setter
    def site_version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "site_version", value)

    @_builtins.property
    @pulumi.getter(name="videoSeekEnable")
    def video_seek_enable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Drag and drop the play function switch. Value range:
        """
        return pulumi.get(self, "video_seek_enable")

    @video_seek_enable.setter
    def video_seek_enable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "video_seek_enable", value)


@pulumi.input_type
class _VideoProcessingState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[_builtins.int]] = None,
                 flv_seek_end: Optional[pulumi.Input[_builtins.str]] = None,
                 flv_seek_start: Optional[pulumi.Input[_builtins.str]] = None,
                 flv_video_seek_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 mp4_seek_end: Optional[pulumi.Input[_builtins.str]] = None,
                 mp4_seek_start: Optional[pulumi.Input[_builtins.str]] = None,
                 rule: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_enable: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_name: Optional[pulumi.Input[_builtins.str]] = None,
                 sequence: Optional[pulumi.Input[_builtins.int]] = None,
                 site_id: Optional[pulumi.Input[_builtins.int]] = None,
                 site_version: Optional[pulumi.Input[_builtins.int]] = None,
                 video_seek_enable: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering VideoProcessing resources.
        :param pulumi.Input[_builtins.int] config_id: Config Id
        :param pulumi.Input[_builtins.str] flv_seek_end: Custom FLV end parameters.
        :param pulumi.Input[_builtins.str] flv_seek_start: Custom FLV start parameters.
        :param pulumi.Input[_builtins.str] flv_video_seek_mode: FLV drag mode. Value range:
        :param pulumi.Input[_builtins.str] mp4_seek_end: Custom mp4 end parameters.
        :param pulumi.Input[_builtins.str] mp4_seek_start: Custom mp4 start parameters.
        :param pulumi.Input[_builtins.str] rule: Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
               - Match all incoming requests: value set to true
               - Match specified request: Set the value to a custom expression, for example: (http.host eq \\"video.example.com\\")
        :param pulumi.Input[_builtins.str] rule_enable: Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
        :param pulumi.Input[_builtins.str] rule_name: Rule name. When adding global configuration, this parameter does not need to be set.
        :param pulumi.Input[_builtins.int] sequence: Order of rule execution. The smaller the value, the higher the priority for execution.
        :param pulumi.Input[_builtins.int] site_id: The site ID, which can be obtained by calling the ListSites API.
        :param pulumi.Input[_builtins.int] site_version: The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        :param pulumi.Input[_builtins.str] video_seek_enable: Drag and drop the play function switch. Value range:
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if flv_seek_end is not None:
            pulumi.set(__self__, "flv_seek_end", flv_seek_end)
        if flv_seek_start is not None:
            pulumi.set(__self__, "flv_seek_start", flv_seek_start)
        if flv_video_seek_mode is not None:
            pulumi.set(__self__, "flv_video_seek_mode", flv_video_seek_mode)
        if mp4_seek_end is not None:
            pulumi.set(__self__, "mp4_seek_end", mp4_seek_end)
        if mp4_seek_start is not None:
            pulumi.set(__self__, "mp4_seek_start", mp4_seek_start)
        if rule is not None:
            pulumi.set(__self__, "rule", rule)
        if rule_enable is not None:
            pulumi.set(__self__, "rule_enable", rule_enable)
        if rule_name is not None:
            pulumi.set(__self__, "rule_name", rule_name)
        if sequence is not None:
            pulumi.set(__self__, "sequence", sequence)
        if site_id is not None:
            pulumi.set(__self__, "site_id", site_id)
        if site_version is not None:
            pulumi.set(__self__, "site_version", site_version)
        if video_seek_enable is not None:
            pulumi.set(__self__, "video_seek_enable", video_seek_enable)

    @_builtins.property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Config Id
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "config_id", value)

    @_builtins.property
    @pulumi.getter(name="flvSeekEnd")
    def flv_seek_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Custom FLV end parameters.
        """
        return pulumi.get(self, "flv_seek_end")

    @flv_seek_end.setter
    def flv_seek_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "flv_seek_end", value)

    @_builtins.property
    @pulumi.getter(name="flvSeekStart")
    def flv_seek_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Custom FLV start parameters.
        """
        return pulumi.get(self, "flv_seek_start")

    @flv_seek_start.setter
    def flv_seek_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "flv_seek_start", value)

    @_builtins.property
    @pulumi.getter(name="flvVideoSeekMode")
    def flv_video_seek_mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        FLV drag mode. Value range:
        """
        return pulumi.get(self, "flv_video_seek_mode")

    @flv_video_seek_mode.setter
    def flv_video_seek_mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "flv_video_seek_mode", value)

    @_builtins.property
    @pulumi.getter(name="mp4SeekEnd")
    def mp4_seek_end(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Custom mp4 end parameters.
        """
        return pulumi.get(self, "mp4_seek_end")

    @mp4_seek_end.setter
    def mp4_seek_end(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mp4_seek_end", value)

    @_builtins.property
    @pulumi.getter(name="mp4SeekStart")
    def mp4_seek_start(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Custom mp4 start parameters.
        """
        return pulumi.get(self, "mp4_seek_start")

    @mp4_seek_start.setter
    def mp4_seek_start(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mp4_seek_start", value)

    @_builtins.property
    @pulumi.getter
    def rule(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
        - Match all incoming requests: value set to true
        - Match specified request: Set the value to a custom expression, for example: (http.host eq \\"video.example.com\\")
        """
        return pulumi.get(self, "rule")

    @rule.setter
    def rule(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule", value)

    @_builtins.property
    @pulumi.getter(name="ruleEnable")
    def rule_enable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
        """
        return pulumi.get(self, "rule_enable")

    @rule_enable.setter
    def rule_enable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule_enable", value)

    @_builtins.property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule name. When adding global configuration, this parameter does not need to be set.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rule_name", value)

    @_builtins.property
    @pulumi.getter
    def sequence(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Order of rule execution. The smaller the value, the higher the priority for execution.
        """
        return pulumi.get(self, "sequence")

    @sequence.setter
    def sequence(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "sequence", value)

    @_builtins.property
    @pulumi.getter(name="siteId")
    def site_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The site ID, which can be obtained by calling the ListSites API.
        """
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "site_id", value)

    @_builtins.property
    @pulumi.getter(name="siteVersion")
    def site_version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        """
        return pulumi.get(self, "site_version")

    @site_version.setter
    def site_version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "site_version", value)

    @_builtins.property
    @pulumi.getter(name="videoSeekEnable")
    def video_seek_enable(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Drag and drop the play function switch. Value range:
        """
        return pulumi.get(self, "video_seek_enable")

    @video_seek_enable.setter
    def video_seek_enable(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "video_seek_enable", value)


@pulumi.type_token("alicloud:esa/videoProcessing:VideoProcessing")
class VideoProcessing(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 flv_seek_end: Optional[pulumi.Input[_builtins.str]] = None,
                 flv_seek_start: Optional[pulumi.Input[_builtins.str]] = None,
                 flv_video_seek_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 mp4_seek_end: Optional[pulumi.Input[_builtins.str]] = None,
                 mp4_seek_start: Optional[pulumi.Input[_builtins.str]] = None,
                 rule: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_enable: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_name: Optional[pulumi.Input[_builtins.str]] = None,
                 sequence: Optional[pulumi.Input[_builtins.int]] = None,
                 site_id: Optional[pulumi.Input[_builtins.int]] = None,
                 site_version: Optional[pulumi.Input[_builtins.int]] = None,
                 video_seek_enable: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a ESA Video Processing resource.

        For information about ESA Video Processing and how to use it, see [What is Video Processing](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateVideoProcessing).

        > **NOTE:** Available since v1.251.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.esa.get_sites(plan_subscribe_type="enterpriseplan")
        default_site = alicloud.esa.Site("default",
            site_name="chenxin0116.site",
            instance_id=default.sites[0].instance_id,
            coverage="overseas",
            access_type="NS")
        default_video_processing = alicloud.esa.VideoProcessing("default",
            video_seek_enable="on",
            rule_enable="on",
            mp4_seek_end="end",
            flv_seek_start="start",
            rule="(http.host eq \\"video.example.com\\")",
            flv_video_seek_mode="by_byte",
            mp4_seek_start="start",
            flv_seek_end="end",
            site_id=default_site.id,
            sequence=1,
            site_version=0,
            rule_name="example")
        ```

        ## Import

        ESA Video Processing can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:esa/videoProcessing:VideoProcessing example <site_id>:<config_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] flv_seek_end: Custom FLV end parameters.
        :param pulumi.Input[_builtins.str] flv_seek_start: Custom FLV start parameters.
        :param pulumi.Input[_builtins.str] flv_video_seek_mode: FLV drag mode. Value range:
        :param pulumi.Input[_builtins.str] mp4_seek_end: Custom mp4 end parameters.
        :param pulumi.Input[_builtins.str] mp4_seek_start: Custom mp4 start parameters.
        :param pulumi.Input[_builtins.str] rule: Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
               - Match all incoming requests: value set to true
               - Match specified request: Set the value to a custom expression, for example: (http.host eq \\"video.example.com\\")
        :param pulumi.Input[_builtins.str] rule_enable: Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
        :param pulumi.Input[_builtins.str] rule_name: Rule name. When adding global configuration, this parameter does not need to be set.
        :param pulumi.Input[_builtins.int] sequence: Order of rule execution. The smaller the value, the higher the priority for execution.
        :param pulumi.Input[_builtins.int] site_id: The site ID, which can be obtained by calling the ListSites API.
        :param pulumi.Input[_builtins.int] site_version: The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        :param pulumi.Input[_builtins.str] video_seek_enable: Drag and drop the play function switch. Value range:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VideoProcessingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ESA Video Processing resource.

        For information about ESA Video Processing and how to use it, see [What is Video Processing](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateVideoProcessing).

        > **NOTE:** Available since v1.251.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.esa.get_sites(plan_subscribe_type="enterpriseplan")
        default_site = alicloud.esa.Site("default",
            site_name="chenxin0116.site",
            instance_id=default.sites[0].instance_id,
            coverage="overseas",
            access_type="NS")
        default_video_processing = alicloud.esa.VideoProcessing("default",
            video_seek_enable="on",
            rule_enable="on",
            mp4_seek_end="end",
            flv_seek_start="start",
            rule="(http.host eq \\"video.example.com\\")",
            flv_video_seek_mode="by_byte",
            mp4_seek_start="start",
            flv_seek_end="end",
            site_id=default_site.id,
            sequence=1,
            site_version=0,
            rule_name="example")
        ```

        ## Import

        ESA Video Processing can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:esa/videoProcessing:VideoProcessing example <site_id>:<config_id>
        ```

        :param str resource_name: The name of the resource.
        :param VideoProcessingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VideoProcessingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 flv_seek_end: Optional[pulumi.Input[_builtins.str]] = None,
                 flv_seek_start: Optional[pulumi.Input[_builtins.str]] = None,
                 flv_video_seek_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 mp4_seek_end: Optional[pulumi.Input[_builtins.str]] = None,
                 mp4_seek_start: Optional[pulumi.Input[_builtins.str]] = None,
                 rule: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_enable: Optional[pulumi.Input[_builtins.str]] = None,
                 rule_name: Optional[pulumi.Input[_builtins.str]] = None,
                 sequence: Optional[pulumi.Input[_builtins.int]] = None,
                 site_id: Optional[pulumi.Input[_builtins.int]] = None,
                 site_version: Optional[pulumi.Input[_builtins.int]] = None,
                 video_seek_enable: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VideoProcessingArgs.__new__(VideoProcessingArgs)

            __props__.__dict__["flv_seek_end"] = flv_seek_end
            __props__.__dict__["flv_seek_start"] = flv_seek_start
            __props__.__dict__["flv_video_seek_mode"] = flv_video_seek_mode
            __props__.__dict__["mp4_seek_end"] = mp4_seek_end
            __props__.__dict__["mp4_seek_start"] = mp4_seek_start
            __props__.__dict__["rule"] = rule
            __props__.__dict__["rule_enable"] = rule_enable
            __props__.__dict__["rule_name"] = rule_name
            __props__.__dict__["sequence"] = sequence
            if site_id is None and not opts.urn:
                raise TypeError("Missing required property 'site_id'")
            __props__.__dict__["site_id"] = site_id
            __props__.__dict__["site_version"] = site_version
            __props__.__dict__["video_seek_enable"] = video_seek_enable
            __props__.__dict__["config_id"] = None
        super(VideoProcessing, __self__).__init__(
            'alicloud:esa/videoProcessing:VideoProcessing',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[_builtins.int]] = None,
            flv_seek_end: Optional[pulumi.Input[_builtins.str]] = None,
            flv_seek_start: Optional[pulumi.Input[_builtins.str]] = None,
            flv_video_seek_mode: Optional[pulumi.Input[_builtins.str]] = None,
            mp4_seek_end: Optional[pulumi.Input[_builtins.str]] = None,
            mp4_seek_start: Optional[pulumi.Input[_builtins.str]] = None,
            rule: Optional[pulumi.Input[_builtins.str]] = None,
            rule_enable: Optional[pulumi.Input[_builtins.str]] = None,
            rule_name: Optional[pulumi.Input[_builtins.str]] = None,
            sequence: Optional[pulumi.Input[_builtins.int]] = None,
            site_id: Optional[pulumi.Input[_builtins.int]] = None,
            site_version: Optional[pulumi.Input[_builtins.int]] = None,
            video_seek_enable: Optional[pulumi.Input[_builtins.str]] = None) -> 'VideoProcessing':
        """
        Get an existing VideoProcessing resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.int] config_id: Config Id
        :param pulumi.Input[_builtins.str] flv_seek_end: Custom FLV end parameters.
        :param pulumi.Input[_builtins.str] flv_seek_start: Custom FLV start parameters.
        :param pulumi.Input[_builtins.str] flv_video_seek_mode: FLV drag mode. Value range:
        :param pulumi.Input[_builtins.str] mp4_seek_end: Custom mp4 end parameters.
        :param pulumi.Input[_builtins.str] mp4_seek_start: Custom mp4 start parameters.
        :param pulumi.Input[_builtins.str] rule: Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
               - Match all incoming requests: value set to true
               - Match specified request: Set the value to a custom expression, for example: (http.host eq \\"video.example.com\\")
        :param pulumi.Input[_builtins.str] rule_enable: Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
        :param pulumi.Input[_builtins.str] rule_name: Rule name. When adding global configuration, this parameter does not need to be set.
        :param pulumi.Input[_builtins.int] sequence: Order of rule execution. The smaller the value, the higher the priority for execution.
        :param pulumi.Input[_builtins.int] site_id: The site ID, which can be obtained by calling the ListSites API.
        :param pulumi.Input[_builtins.int] site_version: The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        :param pulumi.Input[_builtins.str] video_seek_enable: Drag and drop the play function switch. Value range:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VideoProcessingState.__new__(_VideoProcessingState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["flv_seek_end"] = flv_seek_end
        __props__.__dict__["flv_seek_start"] = flv_seek_start
        __props__.__dict__["flv_video_seek_mode"] = flv_video_seek_mode
        __props__.__dict__["mp4_seek_end"] = mp4_seek_end
        __props__.__dict__["mp4_seek_start"] = mp4_seek_start
        __props__.__dict__["rule"] = rule
        __props__.__dict__["rule_enable"] = rule_enable
        __props__.__dict__["rule_name"] = rule_name
        __props__.__dict__["sequence"] = sequence
        __props__.__dict__["site_id"] = site_id
        __props__.__dict__["site_version"] = site_version
        __props__.__dict__["video_seek_enable"] = video_seek_enable
        return VideoProcessing(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[_builtins.int]:
        """
        Config Id
        """
        return pulumi.get(self, "config_id")

    @_builtins.property
    @pulumi.getter(name="flvSeekEnd")
    def flv_seek_end(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Custom FLV end parameters.
        """
        return pulumi.get(self, "flv_seek_end")

    @_builtins.property
    @pulumi.getter(name="flvSeekStart")
    def flv_seek_start(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Custom FLV start parameters.
        """
        return pulumi.get(self, "flv_seek_start")

    @_builtins.property
    @pulumi.getter(name="flvVideoSeekMode")
    def flv_video_seek_mode(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        FLV drag mode. Value range:
        """
        return pulumi.get(self, "flv_video_seek_mode")

    @_builtins.property
    @pulumi.getter(name="mp4SeekEnd")
    def mp4_seek_end(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Custom mp4 end parameters.
        """
        return pulumi.get(self, "mp4_seek_end")

    @_builtins.property
    @pulumi.getter(name="mp4SeekStart")
    def mp4_seek_start(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Custom mp4 start parameters.
        """
        return pulumi.get(self, "mp4_seek_start")

    @_builtins.property
    @pulumi.getter
    def rule(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
        - Match all incoming requests: value set to true
        - Match specified request: Set the value to a custom expression, for example: (http.host eq \\"video.example.com\\")
        """
        return pulumi.get(self, "rule")

    @_builtins.property
    @pulumi.getter(name="ruleEnable")
    def rule_enable(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
        """
        return pulumi.get(self, "rule_enable")

    @_builtins.property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Rule name. When adding global configuration, this parameter does not need to be set.
        """
        return pulumi.get(self, "rule_name")

    @_builtins.property
    @pulumi.getter
    def sequence(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Order of rule execution. The smaller the value, the higher the priority for execution.
        """
        return pulumi.get(self, "sequence")

    @_builtins.property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Output[_builtins.int]:
        """
        The site ID, which can be obtained by calling the ListSites API.
        """
        return pulumi.get(self, "site_id")

    @_builtins.property
    @pulumi.getter(name="siteVersion")
    def site_version(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        """
        return pulumi.get(self, "site_version")

    @_builtins.property
    @pulumi.getter(name="videoSeekEnable")
    def video_seek_enable(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Drag and drop the play function switch. Value range:
        """
        return pulumi.get(self, "video_seek_enable")

