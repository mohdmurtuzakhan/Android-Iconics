/*
 * Copyright 2014 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mikepenz.google_material_typeface_library;

import android.content.Context;
import android.graphics.Typeface;

import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.typeface.ITypeface;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class GoogleMaterial implements ITypeface {
    private static final String TTF_FILE = "material-design-iconic-font-v2.1.2.ttf";

    private static Typeface typeface = null;

    private static HashMap<String, Character> mChars;

    @Override
    public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    @Override
    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap<String, Character> aChars = new HashMap<String, Character>();
            for (Icon v : Icon.values()) {
                aChars.put(v.name(),
                        v.character);
            }
            mChars = aChars;
        }

        return mChars;
    }

    @Override
    public String getMappingPrefix() {
        return "gmd";
    }

    @Override
    public String getFontName() {
        return "Google Material Design";
    }

    @Override
    public String getVersion() {
        return "2.1.2";
    }

    @Override
    public int getIconCount() {
        return mChars.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> icons = new LinkedList<String>();

        for (Icon value : Icon.values()) {
            icons.add(value.name());
        }

        return icons;
    }

    @Override
    public String getAuthor() {
        return "Google. TTF created by Sergey Kupletsky";
    }

    @Override
    public String getUrl() {
        return "http://zavoloklom.github.io/material-design-iconic-font/";
    }

    @Override
    public String getDescription() {
        return "Material Design Iconic Font is a full suite of material design icons (created and maintained by Google) for easy scalable vector graphics on websites.";
    }

    @Override
    public String getLicense() {
        return "SIL OFL 1.1";
    }

    @Override
    public String getLicenseUrl() {
        return "http://scripts.sil.org/OFL";
    }

    @Override
    public Typeface getTypeface(Context context) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(),
                        "fonts/" + TTF_FILE);
            } catch (Exception e) {
                return null;
            }
        }
        return typeface;
    }

    public static enum Icon implements IIcon {
        //Google material design
        gmd_3d_rotation('\uf101'),
        gmd_airplane_off('\uf102'),
        gmd_airplane('\uf103'),
        gmd_album('\uf104'),
        gmd_archive('\uf105'),
        gmd_assignment_account('\uf106'),
        gmd_assignment_alert('\uf107'),
        gmd_assignment_check('\uf108'),
        gmd_assignment_o('\uf109'),
        gmd_assignment_return('\uf10a'),
        gmd_assignment_returned('\uf10b'),
        gmd_assignment('\uf10c'),
        gmd_attachment_alt('\uf10d'),
        gmd_attachment('\uf10e'),
        gmd_audio('\uf10f'),
        gmd_badge_check('\uf110'),
        gmd_balance_wallet('\uf111'),
        gmd_balance('\uf112'),
        gmd_battery_alert('\uf113'),
        gmd_battery_flash('\uf114'),
        gmd_battery_unknown('\uf115'),
        gmd_battery('\uf116'),
        gmd_bike('\uf117'),
        gmd_block_alt('\uf118'),
        gmd_block('\uf119'),
        gmd_boat('\uf11a'),
        gmd_book_image('\uf11b'),
        gmd_book('\uf11c'),
        gmd_bookmark_outline('\uf11d'),
        gmd_bookmark('\uf11e'),
        gmd_brush('\uf11f'),
        gmd_bug('\uf120'),
        gmd_bus('\uf121'),
        gmd_cake('\uf122'),
        gmd_car_taxi('\uf123'),
        gmd_car_wash('\uf124'),
        gmd_car('\uf125'),
        gmd_card_giftcard('\uf126'),
        gmd_card_membership('\uf127'),
        gmd_card_travel('\uf128'),
        gmd_card('\uf129'),
        gmd_case_check('\uf12a'),
        gmd_case_download('\uf12b'),
        gmd_case_play('\uf12c'),
        gmd_case('\uf12d'),
        gmd_cast_connected('\uf12e'),
        gmd_cast('\uf12f'),
        gmd_chart_donut('\uf130'),
        gmd_chart('\uf131'),
        gmd_city_alt('\uf132'),
        gmd_city('\uf133'),
        gmd_close_circle_o('\uf134'),
        gmd_close_circle('\uf135'),
        gmd_close('\uf136'),
        gmd_cocktail('\uf137'),
        gmd_code_setting('\uf138'),
        gmd_code_smartphone('\uf139'),
        gmd_code('\uf13a'),
        gmd_coffee('\uf13b'),
        gmd_collection_bookmark('\uf13c'),
        gmd_collection_case_play('\uf13d'),
        gmd_collection_folder_image('\uf13e'),
        gmd_collection_image_o('\uf13f'),
        gmd_collection_image('\uf140'),
        gmd_collection_item_1('\uf141'),
        gmd_collection_item_2('\uf142'),
        gmd_collection_item_3('\uf143'),
        gmd_collection_item_4('\uf144'),
        gmd_collection_item_5('\uf145'),
        gmd_collection_item_6('\uf146'),
        gmd_collection_item_7('\uf147'),
        gmd_collection_item_8('\uf148'),
        gmd_collection_item_9_plus('\uf149'),
        gmd_collection_item_9('\uf14a'),
        gmd_collection_item('\uf14b'),
        gmd_collection_music('\uf14c'),
        gmd_collection_pdf('\uf14d'),
        gmd_collection_plus('\uf14e'),
        gmd_collection_speaker('\uf14f'),
        gmd_collection_text('\uf150'),
        gmd_collection_video('\uf151'),
        gmd_compass('\uf152'),
        gmd_cutlery('\uf153'),
        gmd_delete('\uf154'),
        gmd_dialpad('\uf155'),
        gmd_dns('\uf156'),
        gmd_drink('\uf157'),
        gmd_edit('\uf158'),
        gmd_email_open('\uf159'),
        gmd_email('\uf15a'),
        gmd_eye_off('\uf15b'),
        gmd_eye('\uf15c'),
        gmd_eyedropper('\uf15d'),
        gmd_favorite_outline('\uf15e'),
        gmd_favorite('\uf15f'),
        gmd_filter_list('\uf160'),
        gmd_fire('\uf161'),
        gmd_flag('\uf162'),
        gmd_flare('\uf163'),
        gmd_flash_auto('\uf164'),
        gmd_flash_off('\uf165'),
        gmd_flash('\uf166'),
        gmd_flip('\uf167'),
        gmd_flower_alt('\uf168'),
        gmd_flower('\uf169'),
        gmd_font('\uf16a'),
        gmd_fullscreen_alt('\uf16b'),
        gmd_fullscreen_exit('\uf16c'),
        gmd_fullscreen('\uf16d'),
        gmd_functions('\uf16e'),
        gmd_gas_station('\uf16f'),
        gmd_gesture('\uf170'),
        gmd_globe_alt('\uf171'),
        gmd_globe_lock('\uf172'),
        gmd_globe('\uf173'),
        gmd_graduation_cap('\uf174'),
        gmd_home('\uf175'),
        gmd_hospital_alt('\uf176'),
        gmd_hospital('\uf177'),
        gmd_hotel('\uf178'),
        gmd_hourglass_alt('\uf179'),
        gmd_hourglass_outline('\uf17a'),
        gmd_hourglass('\uf17b'),
        gmd_http('\uf17c'),
        gmd_image_alt('\uf17d'),
        gmd_image_o('\uf17e'),
        gmd_image('\uf17f'),
        gmd_inbox('\uf180'),
        gmd_invert_colors_off('\uf181'),
        gmd_invert_colors('\uf182'),
        gmd_key('\uf183'),
        gmd_label_alt_outline('\uf184'),
        gmd_label_alt('\uf185'),
        gmd_label_heart('\uf186'),
        gmd_label('\uf187'),
        gmd_labels('\uf188'),
        gmd_lamp('\uf189'),
        gmd_landscape('\uf18a'),
        gmd_layers_off('\uf18b'),
        gmd_layers('\uf18c'),
        gmd_library('\uf18d'),
        gmd_link('\uf18e'),
        gmd_lock_open('\uf18f'),
        gmd_lock_outline('\uf190'),
        gmd_lock('\uf191'),
        gmd_mail_reply_all('\uf192'),
        gmd_mail_reply('\uf193'),
        gmd_mail_send('\uf194'),
        gmd_mall('\uf195'),
        gmd_map('\uf196'),
        gmd_menu('\uf197'),
        gmd_money_box('\uf198'),
        gmd_money_off('\uf199'),
        gmd_money('\uf19a'),
        gmd_more_vert('\uf19b'),
        gmd_more('\uf19c'),
        gmd_movie_alt('\uf19d'),
        gmd_movie('\uf19e'),
        gmd_nature_people('\uf19f'),
        gmd_nature('\uf1a0'),
        gmd_navigation('\uf1a1'),
        gmd_open_in_browser('\uf1a2'),
        gmd_open_in_new('\uf1a3'),
        gmd_palette('\uf1a4'),
        gmd_parking('\uf1a5'),
        gmd_pin_account('\uf1a6'),
        gmd_pin_assistant('\uf1a7'),
        gmd_pin_drop('\uf1a8'),
        gmd_pin_help('\uf1a9'),
        gmd_pin_off('\uf1aa'),
        gmd_pin('\uf1ab'),
        gmd_pizza('\uf1ac'),
        gmd_plaster('\uf1ad'),
        gmd_power_setting('\uf1ae'),
        gmd_power('\uf1af'),
        gmd_print('\uf1b0'),
        gmd_puzzle_piece('\uf1b1'),
        gmd_quote('\uf1b2'),
        gmd_railway('\uf1b3'),
        gmd_receipt('\uf1b4'),
        gmd_refresh_alt('\uf1b5'),
        gmd_refresh_sync_alert('\uf1b6'),
        gmd_refresh_sync_off('\uf1b7'),
        gmd_refresh_sync('\uf1b8'),
        gmd_refresh('\uf1b9'),
        gmd_roller('\uf1ba'),
        gmd_ruler('\uf1bb'),
        gmd_scissors('\uf1bc'),
        gmd_screen_rotation_lock('\uf1bd'),
        gmd_screen_rotation('\uf1be'),
        gmd_search_for('\uf1bf'),
        gmd_search_in_file('\uf1c0'),
        gmd_search_in_page('\uf1c1'),
        gmd_search_replace('\uf1c2'),
        gmd_search('\uf1c3'),
        gmd_seat('\uf1c4'),
        gmd_settings_square('\uf1c5'),
        gmd_settings('\uf1c6'),
        gmd_shield_check('\uf1c7'),
        gmd_shield_security('\uf1c8'),
        gmd_shopping_basket('\uf1c9'),
        gmd_shopping_cart_plus('\uf1ca'),
        gmd_shopping_cart('\uf1cb'),
        gmd_sign_in('\uf1cc'),
        gmd_sort_amount_asc('\uf1cd'),
        gmd_sort_amount_desc('\uf1ce'),
        gmd_sort_asc('\uf1cf'),
        gmd_sort_desc('\uf1d0'),
        gmd_spellcheck('\uf1d1'),
        gmd_storage('\uf1d2'),
        gmd_store_24('\uf1d3'),
        gmd_store('\uf1d4'),
        gmd_subway('\uf1d5'),
        gmd_sun('\uf1d6'),
        gmd_tab_unselected('\uf1d7'),
        gmd_tab('\uf1d8'),
        gmd_tag_close('\uf1d9'),
        gmd_tag_more('\uf1da'),
        gmd_tag('\uf1db'),
        gmd_thumb_down('\uf1dc'),
        gmd_thumb_up_down('\uf1dd'),
        gmd_thumb_up('\uf1de'),
        gmd_ticket_star('\uf1df'),
        gmd_toll('\uf1e0'),
        gmd_toys('\uf1e1'),
        gmd_traffic('\uf1e2'),
        gmd_translate('\uf1e3'),
        gmd_triangle_down('\uf1e4'),
        gmd_triangle_up('\uf1e5'),
        gmd_truck('\uf1e6'),
        gmd_turning_sign('\uf1e7'),
        gmd_wallpaper('\uf1e8'),
        gmd_washing_machine('\uf1e9'),
        gmd_window_maximize('\uf1ea'),
        gmd_window_minimize('\uf1eb'),
        gmd_window_restore('\uf1ec'),
        gmd_wrench('\uf1ed'),
        gmd_zoom_in('\uf1ee'),
        gmd_zoom_out('\uf1ef'),
        gmd_alert_circle_o('\uf1f0'),
        gmd_alert_circle('\uf1f1'),
        gmd_alert_octagon('\uf1f2'),
        gmd_alert_polygon('\uf1f3'),
        gmd_alert_triangle('\uf1f4'),
        gmd_help_outline('\uf1f5'),
        gmd_help('\uf1f6'),
        gmd_info_outline('\uf1f7'),
        gmd_info('\uf1f8'),
        gmd_notifications_active('\uf1f9'),
        gmd_notifications_add('\uf1fa'),
        gmd_notifications_none('\uf1fb'),
        gmd_notifications_off('\uf1fc'),
        gmd_notifications_paused('\uf1fd'),
        gmd_notifications('\uf1fe'),
        gmd_account_add('\uf1ff'),
        gmd_account_box_mail('\uf200'),
        gmd_account_box_o('\uf201'),
        gmd_account_box_phone('\uf202'),
        gmd_account_box('\uf203'),
        gmd_account_calendar('\uf204'),
        gmd_account_circle('\uf205'),
        gmd_account_o('\uf206'),
        gmd_account('\uf207'),
        gmd_accounts_add('\uf208'),
        gmd_accounts_alt('\uf209'),
        gmd_accounts_list_alt('\uf20a'),
        gmd_accounts_list('\uf20b'),
        gmd_accounts_outline('\uf20c'),
        gmd_accounts('\uf20d'),
        gmd_face('\uf20e'),
        gmd_female('\uf20f'),
        gmd_male_alt('\uf210'),
        gmd_male_female('\uf211'),
        gmd_male('\uf212'),
        gmd_mood_bad('\uf213'),
        gmd_mood('\uf214'),
        gmd_run('\uf215'),
        gmd_walk('\uf216'),
        gmd_cloud_box('\uf217'),
        gmd_cloud_circle('\uf218'),
        gmd_cloud_done('\uf219'),
        gmd_cloud_download('\uf21a'),
        gmd_cloud_off('\uf21b'),
        gmd_cloud_outline_alt('\uf21c'),
        gmd_cloud_outline('\uf21d'),
        gmd_cloud_upload('\uf21e'),
        gmd_cloud('\uf21f'),
        gmd_download('\uf220'),
        gmd_file_plus('\uf221'),
        gmd_file_text('\uf222'),
        gmd_file('\uf223'),
        gmd_folder_outline('\uf224'),
        gmd_folder_person('\uf225'),
        gmd_folder_star_alt('\uf226'),
        gmd_folder_star('\uf227'),
        gmd_folder('\uf228'),
        gmd_gif('\uf229'),
        gmd_upload('\uf22a'),
        gmd_border_all('\uf22b'),
        gmd_border_bottom('\uf22c'),
        gmd_border_clear('\uf22d'),
        gmd_border_color('\uf22e'),
        gmd_border_horizontal('\uf22f'),
        gmd_border_inner('\uf230'),
        gmd_border_left('\uf231'),
        gmd_border_outer('\uf232'),
        gmd_border_right('\uf233'),
        gmd_border_style('\uf234'),
        gmd_border_top('\uf235'),
        gmd_border_vertical('\uf236'),
        gmd_copy('\uf237'),
        gmd_crop('\uf238'),
        gmd_format_align_center('\uf239'),
        gmd_format_align_justify('\uf23a'),
        gmd_format_align_left('\uf23b'),
        gmd_format_align_right('\uf23c'),
        gmd_format_bold('\uf23d'),
        gmd_format_clear_all('\uf23e'),
        gmd_format_clear('\uf23f'),
        gmd_format_color_fill('\uf240'),
        gmd_format_color_reset('\uf241'),
        gmd_format_color_text('\uf242'),
        gmd_format_indent_decrease('\uf243'),
        gmd_format_indent_increase('\uf244'),
        gmd_format_italic('\uf245'),
        gmd_format_line_spacing('\uf246'),
        gmd_format_list_bulleted('\uf247'),
        gmd_format_list_numbered('\uf248'),
        gmd_format_ltr('\uf249'),
        gmd_format_rtl('\uf24a'),
        gmd_format_size('\uf24b'),
        gmd_format_strikethrough_s('\uf24c'),
        gmd_format_strikethrough('\uf24d'),
        gmd_format_subject('\uf24e'),
        gmd_format_underlined('\uf24f'),
        gmd_format_valign_bottom('\uf250'),
        gmd_format_valign_center('\uf251'),
        gmd_format_valign_top('\uf252'),
        gmd_redo('\uf253'),
        gmd_select_all('\uf254'),
        gmd_space_bar('\uf255'),
        gmd_text_format('\uf256'),
        gmd_transform('\uf257'),
        gmd_undo('\uf258'),
        gmd_wrap_text('\uf259'),
        gmd_comment_alert('\uf25a'),
        gmd_comment_alt_text('\uf25b'),
        gmd_comment_alt('\uf25c'),
        gmd_comment_edit('\uf25d'),
        gmd_comment_image('\uf25e'),
        gmd_comment_list('\uf25f'),
        gmd_comment_more('\uf260'),
        gmd_comment_outline('\uf261'),
        gmd_comment_text_alt('\uf262'),
        gmd_comment_text('\uf263'),
        gmd_comment_video('\uf264'),
        gmd_comment('\uf265'),
        gmd_comments('\uf266'),
        gmd_check_all('\uf267'),
        gmd_check_circle_u('\uf268'),
        gmd_check_circle('\uf269'),
        gmd_check_square('\uf26a'),
        gmd_check('\uf26b'),
        gmd_circle_o('\uf26c'),
        gmd_circle('\uf26d'),
        gmd_dot_circle_alt('\uf26e'),
        gmd_dot_circle('\uf26f'),
        gmd_minus_circle_outline('\uf270'),
        gmd_minus_circle('\uf271'),
        gmd_minus_square('\uf272'),
        gmd_minus('\uf273'),
        gmd_plus_circle_o_duplicate('\uf274'),
        gmd_plus_circle_o('\uf275'),
        gmd_plus_circle('\uf276'),
        gmd_plus_square('\uf277'),
        gmd_plus('\uf278'),
        gmd_square_o('\uf279'),
        gmd_star_circle('\uf27a'),
        gmd_star_half('\uf27b'),
        gmd_star_outline('\uf27c'),
        gmd_star('\uf27d'),
        gmd_bluetooth_connected('\uf27e'),
        gmd_bluetooth_off('\uf27f'),
        gmd_bluetooth_search('\uf280'),
        gmd_bluetooth_setting('\uf281'),
        gmd_bluetooth('\uf282'),
        gmd_camera_add('\uf283'),
        gmd_camera_alt('\uf284'),
        gmd_camera_bw('\uf285'),
        gmd_camera_front('\uf286'),
        gmd_camera_mic('\uf287'),
        gmd_camera_party_mode('\uf288'),
        gmd_camera_rear('\uf289'),
        gmd_camera_roll('\uf28a'),
        gmd_camera_switch('\uf28b'),
        gmd_camera('\uf28c'),
        gmd_card_alert('\uf28d'),
        gmd_card_off('\uf28e'),
        gmd_card_sd('\uf28f'),
        gmd_card_sim('\uf290'),
        gmd_desktop_mac('\uf291'),
        gmd_desktop_windows('\uf292'),
        gmd_device_hub('\uf293'),
        gmd_devices_off('\uf294'),
        gmd_devices('\uf295'),
        gmd_dock('\uf296'),
        gmd_floppy('\uf297'),
        gmd_gamepad('\uf298'),
        gmd_gps_dot('\uf299'),
        gmd_gps_off('\uf29a'),
        gmd_gps('\uf29b'),
        gmd_headset_mic('\uf29c'),
        gmd_headset('\uf29d'),
        gmd_input_antenna('\uf29e'),
        gmd_input_composite('\uf29f'),
        gmd_input_hdmi('\uf2a0'),
        gmd_input_power('\uf2a1'),
        gmd_input_svideo('\uf2a2'),
        gmd_keyboard_hide('\uf2a3'),
        gmd_keyboard('\uf2a4'),
        gmd_laptop_chromebook('\uf2a5'),
        gmd_laptop_mac('\uf2a6'),
        gmd_laptop('\uf2a7'),
        gmd_mic_off('\uf2a8'),
        gmd_mic_outline('\uf2a9'),
        gmd_mic_setting('\uf2aa'),
        gmd_mic('\uf2ab'),
        gmd_mouse('\uf2ac'),
        gmd_network_alert('\uf2ad'),
        gmd_network_locked('\uf2ae'),
        gmd_network_off('\uf2af'),
        gmd_network_outline('\uf2b0'),
        gmd_network_setting('\uf2b1'),
        gmd_network('\uf2b2'),
        gmd_phone_bluetooth('\uf2b3'),
        gmd_phone_end('\uf2b4'),
        gmd_phone_forwarded('\uf2b5'),
        gmd_phone_in_talk('\uf2b6'),
        gmd_phone_locked('\uf2b7'),
        gmd_phone_missed('\uf2b8'),
        gmd_phone_msg('\uf2b9'),
        gmd_phone_paused('\uf2ba'),
        gmd_phone_ring('\uf2bb'),
        gmd_phone_setting('\uf2bc'),
        gmd_phone_sip('\uf2bd'),
        gmd_phone('\uf2be'),
        gmd_portable_wifi_changes('\uf2bf'),
        gmd_portable_wifi_off('\uf2c0'),
        gmd_portable_wifi('\uf2c1'),
        gmd_radio('\uf2c2'),
        gmd_reader('\uf2c3'),
        gmd_remote_control_alt('\uf2c4'),
        gmd_remote_control('\uf2c5'),
        gmd_router('\uf2c6'),
        gmd_scanner('\uf2c7'),
        gmd_smartphone_android('\uf2c8'),
        gmd_smartphone_download('\uf2c9'),
        gmd_smartphone_erase('\uf2ca'),
        gmd_smartphone_info('\uf2cb'),
        gmd_smartphone_iphone('\uf2cc'),
        gmd_smartphone_landscape_lock('\uf2cd'),
        gmd_smartphone_landscape('\uf2ce'),
        gmd_smartphone_lock('\uf2cf'),
        gmd_smartphone_portrait_lock('\uf2d0'),
        gmd_smartphone_ring('\uf2d1'),
        gmd_smartphone_setting('\uf2d2'),
        gmd_smartphone_setup('\uf2d3'),
        gmd_smartphone('\uf2d4'),
        gmd_speaker('\uf2d5'),
        gmd_tablet_android('\uf2d6'),
        gmd_tablet_mac('\uf2d7'),
        gmd_tablet('\uf2d8'),
        gmd_tv_alt_play('\uf2d9'),
        gmd_tv_list('\uf2da'),
        gmd_tv_play('\uf2db'),
        gmd_tv('\uf2dc'),
        gmd_usb('\uf2dd'),
        gmd_videocam_off('\uf2de'),
        gmd_videocam_switch('\uf2df'),
        gmd_videocam('\uf2e0'),
        gmd_watch('\uf2e1'),
        gmd_wifi_alt_2('\uf2e2'),
        gmd_wifi_alt('\uf2e3'),
        gmd_wifi_info('\uf2e4'),
        gmd_wifi_lock('\uf2e5'),
        gmd_wifi_off('\uf2e6'),
        gmd_wifi_outline('\uf2e7'),
        gmd_wifi('\uf2e8'),
        gmd_arrow_left_bottom('\uf2e9'),
        gmd_arrow_left('\uf2ea'),
        gmd_arrow_merge('\uf2eb'),
        gmd_arrow_missed('\uf2ec'),
        gmd_arrow_right_top('\uf2ed'),
        gmd_arrow_right('\uf2ee'),
        gmd_arrow_split('\uf2ef'),
        gmd_arrows('\uf2f0'),
        gmd_caret_down_circle('\uf2f1'),
        gmd_caret_down('\uf2f2'),
        gmd_caret_left_circle('\uf2f3'),
        gmd_caret_left('\uf2f4'),
        gmd_caret_right_circle('\uf2f5'),
        gmd_caret_right('\uf2f6'),
        gmd_caret_up_circle('\uf2f7'),
        gmd_caret_up('\uf2f8'),
        gmd_chevron_down('\uf2f9'),
        gmd_chevron_left('\uf2fa'),
        gmd_chevron_right('\uf2fb'),
        gmd_chevron_up('\uf2fc'),
        gmd_forward('\uf2fd'),
        gmd_long_arrow_down('\uf2fe'),
        gmd_long_arrow_left('\uf2ff'),
        gmd_long_arrow_return('\uf300'),
        gmd_long_arrow_right('\uf301'),
        gmd_long_arrow_tab('\uf302'),
        gmd_long_arrow_up('\uf303'),
        gmd_rotate_ccw('\uf304'),
        gmd_rotate_cw('\uf305'),
        gmd_rotate_left('\uf306'),
        gmd_rotate_right('\uf307'),
        gmd_square_down('\uf308'),
        gmd_square_right('\uf309'),
        gmd_swap_alt('\uf30a'),
        gmd_swap_vertical_circle('\uf30b'),
        gmd_swap_vertical('\uf30c'),
        gmd_swap('\uf30d'),
        gmd_trending_down('\uf30e'),
        gmd_trending_flat('\uf30f'),
        gmd_trending_up('\uf310'),
        gmd_unfold_less('\uf311'),
        gmd_unfold_more('\uf312'),
        gmd_apps('\uf313'),
        gmd_grid_off('\uf314'),
        gmd_grid('\uf315'),
        gmd_view_agenda('\uf316'),
        gmd_view_array('\uf317'),
        gmd_view_carousel('\uf318'),
        gmd_view_column('\uf319'),
        gmd_view_comfy('\uf31a'),
        gmd_view_compact('\uf31b'),
        gmd_view_dashboard('\uf31c'),
        gmd_view_day('\uf31d'),
        gmd_view_headline('\uf31e'),
        gmd_view_list_alt('\uf31f'),
        gmd_view_list('\uf320'),
        gmd_view_module('\uf321'),
        gmd_view_quilt('\uf322'),
        gmd_view_stream('\uf323'),
        gmd_view_subtitles('\uf324'),
        gmd_view_toc('\uf325'),
        gmd_view_web('\uf326'),
        gmd_view_week('\uf327'),
        gmd_widgets('\uf328'),
        gmd_alarm_check('\uf329'),
        gmd_alarm_off('\uf32a'),
        gmd_alarm_plus('\uf32b'),
        gmd_alarm_snooze('\uf32c'),
        gmd_alarm('\uf32d'),
        gmd_calendar_alt('\uf32e'),
        gmd_calendar_check('\uf32f'),
        gmd_calendar_close('\uf330'),
        gmd_calendar_note('\uf331'),
        gmd_calendar('\uf332'),
        gmd_time_countdown('\uf333'),
        gmd_time_interval('\uf334'),
        gmd_time_restore_setting('\uf335'),
        gmd_time_restore('\uf336'),
        gmd_time('\uf337'),
        gmd_timer_off('\uf338'),
        gmd_timer('\uf339'),
        gmd_android_alt('\uf33a'),
        gmd_android('\uf33b'),
        gmd_apple('\uf33c'),
        gmd_behance('\uf33d'),
        gmd_codepen('\uf33e'),
        gmd_dribbble('\uf33f'),
        gmd_dropbox('\uf340'),
        gmd_evernote('\uf341'),
        gmd_facebook_box('\uf342'),
        gmd_facebook('\uf343'),
        gmd_github_box('\uf344'),
        gmd_github('\uf345'),
        gmd_google_drive('\uf346'),
        gmd_google_earth('\uf347'),
        gmd_google_glass('\uf348'),
        gmd_google_maps('\uf349'),
        gmd_google_pages('\uf34a'),
        gmd_google_play('\uf34b'),
        gmd_google_plus_box('\uf34c'),
        gmd_google_plus('\uf34d'),
        gmd_google('\uf34e'),
        gmd_instagram('\uf34f'),
        gmd_language_css3('\uf350'),
        gmd_language_html5('\uf351'),
        gmd_language_javascript('\uf352'),
        gmd_language_python_alt('\uf353'),
        gmd_language_python('\uf354'),
        gmd_lastfm('\uf355'),
        gmd_linkedin_box('\uf356'),
        gmd_paypal('\uf357'),
        gmd_pinterest_box('\uf358'),
        gmd_pocket('\uf359'),
        gmd_polymer('\uf35a'),
        gmd_share('\uf35b'),
        gmd_stack_overflow('\uf35c'),
        gmd_steam_square('\uf35d'),
        gmd_steam('\uf35e'),
        gmd_twitter_box('\uf35f'),
        gmd_twitter('\uf360'),
        gmd_vk('\uf361'),
        gmd_wikipedia('\uf362'),
        gmd_windows('\uf363'),
        gmd_aspect_ratio_alt('\uf364'),
        gmd_aspect_ratio('\uf365'),
        gmd_blur_circular('\uf366'),
        gmd_blur_linear('\uf367'),
        gmd_blur_off('\uf368'),
        gmd_blur('\uf369'),
        gmd_brightness_2('\uf36a'),
        gmd_brightness_3('\uf36b'),
        gmd_brightness_4('\uf36c'),
        gmd_brightness_5('\uf36d'),
        gmd_brightness_6('\uf36e'),
        gmd_brightness_7('\uf36f'),
        gmd_brightness_auto('\uf370'),
        gmd_brightness_setting('\uf371'),
        gmd_broken_image('\uf372'),
        gmd_center_focus_strong('\uf373'),
        gmd_center_focus_weak('\uf374'),
        gmd_compare('\uf375'),
        gmd_crop_16_9('\uf376'),
        gmd_crop_3_2('\uf377'),
        gmd_crop_5_4('\uf378'),
        gmd_crop_7_5('\uf379'),
        gmd_crop_din('\uf37a'),
        gmd_crop_free('\uf37b'),
        gmd_crop_landscape('\uf37c'),
        gmd_crop_portrait('\uf37d'),
        gmd_crop_square('\uf37e'),
        gmd_exposure_alt('\uf37f'),
        gmd_exposure('\uf380'),
        gmd_filter_b_and_w('\uf381'),
        gmd_filter_center_focus('\uf382'),
        gmd_filter_frames('\uf383'),
        gmd_filter_tilt_shift('\uf384'),
        gmd_gradient('\uf385'),
        gmd_grain('\uf386'),
        gmd_graphic_eq('\uf387'),
        gmd_hdr_off('\uf388'),
        gmd_hdr_strong('\uf389'),
        gmd_hdr_weak('\uf38a'),
        gmd_hdr('\uf38b'),
        gmd_iridescent('\uf38c'),
        gmd_leak_off('\uf38d'),
        gmd_leak('\uf38e'),
        gmd_looks('\uf38f'),
        gmd_loupe('\uf390'),
        gmd_panorama_horizontal('\uf391'),
        gmd_panorama_vertical('\uf392'),
        gmd_panorama_wide_angle('\uf393'),
        gmd_photo_size_select_large('\uf394'),
        gmd_photo_size_select_small('\uf395'),
        gmd_picture_in_picture('\uf396'),
        gmd_slideshow('\uf397'),
        gmd_texture('\uf398'),
        gmd_tonality('\uf399'),
        gmd_vignette('\uf39a'),
        gmd_wb_auto('\uf39b'),
        gmd_eject_alt('\uf39c'),
        gmd_eject('\uf39d'),
        gmd_equalizer('\uf39e'),
        gmd_fast_forward('\uf39f'),
        gmd_fast_rewind('\uf3a0'),
        gmd_forward_10('\uf3a1'),
        gmd_forward_30('\uf3a2'),
        gmd_forward_5('\uf3a3'),
        gmd_hearing('\uf3a4'),
        gmd_pause_circle_outline('\uf3a5'),
        gmd_pause_circle('\uf3a6'),
        gmd_pause('\uf3a7'),
        gmd_play_circle_outline('\uf3a8'),
        gmd_play_circle('\uf3a9'),
        gmd_play('\uf3aa'),
        gmd_playlist_audio('\uf3ab'),
        gmd_playlist_plus('\uf3ac'),
        gmd_repeat_one('\uf3ad'),
        gmd_repeat('\uf3ae'),
        gmd_replay_10('\uf3af'),
        gmd_replay_30('\uf3b0'),
        gmd_replay_5('\uf3b1'),
        gmd_replay('\uf3b2'),
        gmd_shuffle('\uf3b3'),
        gmd_skip_next('\uf3b4'),
        gmd_skip_previous('\uf3b5'),
        gmd_stop('\uf3b6'),
        gmd_surround_sound('\uf3b7'),
        gmd_tune('\uf3b8'),
        gmd_volume_down('\uf3b9'),
        gmd_volume_mute('\uf3ba'),
        gmd_volume_off('\uf3bb'),
        gmd_volume_up('\uf3bc'),
        gmd_n_1_square('\uf3bd'),
        gmd_n_2_square('\uf3be'),
        gmd_n_3_square('\uf3bf'),
        gmd_n_4_square('\uf3c0'),
        gmd_n_5_square('\uf3c1'),
        gmd_n_6_square('\uf3c2'),
        gmd_neg_1('\uf3c3'),
        gmd_neg_2('\uf3c4'),
        gmd_plus_1('\uf3c5'),
        gmd_plus_2('\uf3c6'),
        gmd_sec_10('\uf3c7'),
        gmd_sec_3('\uf3c8'),
        gmd_zero('\uf3c9'),
        gmd_airline_seat_flat_angled('\uf3ca'),
        gmd_airline_seat_flat('\uf3cb'),
        gmd_airline_seat_individual_suite('\uf3cc'),
        gmd_airline_seat_legroom_extra('\uf3cd'),
        gmd_airline_seat_legroom_normal('\uf3ce'),
        gmd_airline_seat_legroom_reduced('\uf3cf'),
        gmd_airline_seat_recline_extra('\uf3d0'),
        gmd_airline_seat_recline_normal('\uf3d1'),
        gmd_airplay('\uf3d2'),
        gmd_closed_caption('\uf3d3'),
        gmd_confirmation_number('\uf3d4'),
        gmd_developer_board('\uf3d5'),
        gmd_disc_full('\uf3d6'),
        gmd_explicit('\uf3d7'),
        gmd_flight_land('\uf3d8'),
        gmd_flight_takeoff('\uf3d9'),
        gmd_flip_to_back('\uf3da'),
        gmd_flip_to_front('\uf3db'),
        gmd_group_work('\uf3dc'),
        gmd_hd('\uf3dd'),
        gmd_hq('\uf3de'),
        gmd_markunread_mailbox('\uf3df'),
        gmd_memory('\uf3e0'),
        gmd_nfc('\uf3e1'),
        gmd_play_for_work('\uf3e2'),
        gmd_power_input('\uf3e3'),
        gmd_present_to_all('\uf3e4'),
        gmd_satellite('\uf3e5'),
        gmd_tap_and_play('\uf3e6'),
        gmd_vibration('\uf3e7'),
        gmd_voicemail('\uf3e8'),
        gmd_import_export('\uf30c'),
        gmd_swap_vertical_('\uf30c'),
        gmd_airplanemode_inactive('\uf102'),
        gmd_airplanemode_active('\uf103'),
        gmd_rate_review('\uf103'),
        gmd_comment_sign('\uf25a'),
        gmd_network_warning('\uf2ad'),
        gmd_shopping_cart_add('\uf1ca'),
        gmd_file_add('\uf221'),
        gmd_network_wifi_scan('\uf2e4'),
        gmd_collection_add('\uf14e'),
        gmd_format_playlist_add('\uf3ac'),
        gmd_format_queue_music('\uf3ab'),
        gmd_plus_box('\uf277'),
        gmd_tag_backspace('\uf1d9'),
        gmd_alarm_add('\uf32b'),
        gmd_battery_charging('\uf114'),
        gmd_daydream_setting('\uf217'),
        gmd_more_horiz('\uf19c'),
        gmd_book_photo('\uf11b'),
        gmd_incandescent('\uf189'),
        gmd_wb_iridescent('\uf38c'),
        gmd_calendar_remove('\uf330'),
        gmd_refresh_sync_disabled('\uf1b7'),
        gmd_refresh_sync_problem('\uf1b6'),
        gmd_crop_original('\uf17e'),
        gmd_power_off('\uf1af'),
        gmd_power_off_setting('\uf1ae'),
        gmd_leak_remove('\uf38d'),
        gmd_star_border('\uf27c'),
        gmd_brightness_low('\uf36d'),
        gmd_brightness_medium('\uf36e'),
        gmd_brightness_high('\uf36f'),
        gmd_smartphone_portrait('\uf2d4'),
        gmd_live_tv('\uf2d9'),
        gmd_format_textdirection_l_to_r('\uf249'),
        gmd_format_textdirection_r_to_l('\uf24a'),
        gmd_arrow_back('\uf2ea'),
        gmd_arrow_forward('\uf2ee'),
        gmd_arrow_in('\uf2e9'),
        gmd_arrow_out('\uf2ed'),
        gmd_rotate_90_degrees_ccw('\uf304'),
        gmd_adb('\uf33a'),
        gmd_network_wifi('\uf2e8'),
        gmd_network_wifi_alt('\uf2e3'),
        gmd_network_wifi_lock('\uf2e5'),
        gmd_network_wifi_off('\uf2e6'),
        gmd_network_wifi_outline('\uf2e7'),
        gmd_network_wifi_info('\uf2e4'),
        gmd_layers_clear('\uf18b'),
        gmd_colorize('\uf15d'),
        gmd_format_paint('\uf1ba'),
        gmd_format_quote('\uf1b2'),
        gmd_camera_monochrome_photos('\uf285'),
        gmd_sort_by_alpha('\uf1cf'),
        gmd_folder_shared('\uf225'),
        gmd_folder_special('\uf226'),
        gmd_comment_dots('\uf260'),
        gmd_reorder('\uf31e'),
        gmd_dehaze('\uf197'),
        gmd_sort('\uf1ce'),
        gmd_pages('\uf34a'),
        gmd_calendar_account('\uf204'),
        gmd_paste('\uf109'),
        gmd_cut('\uf1bc'),
        gmd_save('\uf297'),
        gmd_smartphone_code('\uf139'),
        gmd_directions_bike('\uf117'),
        gmd_directions_boat('\uf11a'),
        gmd_directions_bus('\uf121'),
        gmd_directions_car('\uf125'),
        gmd_directions_railway('\uf1b3'),
        gmd_directions_run('\uf215'),
        gmd_directions_subway('\uf1d5'),
        gmd_directions_walk('\uf216'),
        gmd_local_hotel('\uf178'),
        gmd_local_activity('\uf1df'),
        gmd_local_play('\uf1df'),
        gmd_local_airport('\uf103'),
        gmd_local_atm('\uf198'),
        gmd_local_bar('\uf137'),
        gmd_local_cafe('\uf13b'),
        gmd_local_car_wash('\uf124'),
        gmd_local_convenience_store('\uf1d3'),
        gmd_local_dining('\uf153'),
        gmd_local_drink('\uf157'),
        gmd_local_florist('\uf168'),
        gmd_local_gas_station('\uf16f'),
        gmd_local_grocery_store('\uf1cb'),
        gmd_local_hospital('\uf177'),
        gmd_local_laundry_service('\uf1e9'),
        gmd_local_library('\uf18d'),
        gmd_local_mall('\uf195'),
        gmd_local_movies('\uf19d'),
        gmd_local_offer('\uf187'),
        gmd_local_parking('\uf1a5'),
        gmd_local_pharmacy('\uf176'),
        gmd_local_phone('\uf2be'),
        gmd_local_pizza('\uf1ac'),
        gmd_local_post_office('\uf15a'),
        gmd_local_printshop('\uf1b0'),
        gmd_local_see('\uf28c'),
        gmd_local_shipping('\uf1e6'),
        gmd_local_store('\uf1d4'),
        gmd_local_taxi('\uf123'),
        gmd_local_wc('\uf211'),
        gmd_my_location('\uf299'),
        gmd_directions('\uf1e7');

        char character;

        Icon(char character) {
            this.character = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return character;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface typeface;

        public ITypeface getTypeface() {
            if (typeface == null) {
                typeface = new GoogleMaterial();
            }
            return typeface;
        }
    }
}
